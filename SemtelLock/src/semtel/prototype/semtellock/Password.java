package semtel.prototype.semtellock;

public class Password {
	String password;
	
	Password(){
		password = "";
	}
	
	String getPassword(){
		return password;
	}
	
	void setPassword(String in){
		password = in;
	}
	
	boolean isRight(String in){
		if(password.equals(in))
			return true;
		else
			return false;
	}
}
