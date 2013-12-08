package semtel.prototype.semtellock;

import java.io.IOException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SemtelLock {
	
	String password;
	Boolean isLock;
	
	public SemtelLock(){
		
		//파일로부터 불러와야한다.
		
		//password = ..to do..
		isLock = false;
		
	}
	
	public void setPassword(String password){
		this.password = password;
		
	}
	
	public Boolean isRight(String param){
		//TO DO...
		//AES256 암호화 과정을 거친 param과 비교를 해야한다.
		Boolean result = false;
		
		if(password.equals(param)){
			result = true;
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
