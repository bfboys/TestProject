package semtel.prototype.semtellock;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import net.imcore.AES256Cipher;

public class SemtelLock {
	
	String key;
	String encodedPassword;
	Boolean isLock;
	
	public SemtelLock(){
		
		//to do : key and encodedPassword load in file
		
		isLock = false;
		key = "abcdefghijklmnopqrstuvwxyz123456";
			
		
	}
	
	public void setPassword(String pramPassword){
		
		
		try {
			
			//apply AES256 
			this.encodedPassword = AES256Cipher.AES_Encode(pramPassword, key);
			
			//to do : encodedPassword store in file
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Boolean isRight(String paramPassword){
		//TO DO...
		//AES256 암호화 과정을 거친 param과 비교를 해야한다.
		Boolean result = false;
			
		
		try {
			//apply AES256 
			if(encodedPassword.equals(AES256Cipher.AES_Encode(paramPassword, key))){
				result = true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		} 
	
		return result;
	}
	
	public void setLock(){
		isLock = true;
	}
	
	public void setUnLock(){
		isLock = false;
	}
	
	public Boolean isLock(){
		return isLock;
	}

}
