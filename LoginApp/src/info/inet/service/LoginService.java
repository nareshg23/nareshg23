package info.inet.service;

public class LoginService {
	
	public boolean authentication(String username,String password) {
		
		
		if(password == null || password.trim()==""){
			return false;
		}
		return true;  
	}

}
