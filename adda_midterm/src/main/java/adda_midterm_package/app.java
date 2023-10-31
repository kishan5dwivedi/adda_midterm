package adda_midterm_package;

import java.util.ResourceBundle;
public class app {
	
	public int login(String userid,String password) {
		
		ResourceBundle rv = ResourceBundle.getBundle("config");
		String user = rv.getString("username");
		String pass = rv.getString("password");
		if(userid.equals(user) && password.equals(pass)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
