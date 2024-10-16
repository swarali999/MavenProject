package facebook;


	import org.testng.annotations.Test;

	public class LoginTestCase {
		 @Test(priority=100)
	     void openapp()
	     {
	    	System.out.println("opening application"); 
	     }
		 @Test(priority=20)
	     void login()
	     {
	    	 System.out.println("Login to application"); 
	     }
	     @Test(priority=0)
	     void logout()
	     {
	    	 System.out.println("Log out from application"); 
	     
	     }
	}


