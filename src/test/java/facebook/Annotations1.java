package facebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations1 {
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	
	 @AfterClass
	 void logout()
	 {
		 System.out.println("this is logout");
	 }
	 
	 @Test(priority=1)
	 void search()
	 {
		 System.out.println("This is search");
	 }
	 
	 @Test(priority=2)
	 void advancedsearch()
	 {
		 System.out.println("advanced search");
	 }
}
	 


