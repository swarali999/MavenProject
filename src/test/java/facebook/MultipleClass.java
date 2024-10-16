package facebook;


	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;

		public class MultipleClass
		{
		 public WebDriver driver;
		  @BeforeTest
		  public void preRequisite() 
		  {
			 
			  driver=new EdgeDriver();   
			  driver.get("https://www.facebook.com/");
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();	  
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  }
		  
		  @Test(priority=2)
		  public void verifyingFacebookPageTitle()
		  {
			   String expectedTitle="Facebook – log in or sign up";
			   String actualResult=driver.getTitle();
			   Assert.assertEquals(actualResult, expectedTitle, "Expected and Actual titles are not matching");
			  
		  }
		  
		  @Test(priority=1)
		  public void verifyingLoginFunctionality()
		  {
			  WebElement UserNameTextBox=driver.findElement(By.xpath("//*[@id='email']"));
			  WebElement PasswordTextBox=driver.findElement(By.xpath("//*[@id='pass']"));
			  WebElement LogInButton=driver.findElement(By.xpath("//*[@name='login']"));
			  Assert.assertTrue(UserNameTextBox.isDisplayed(), "Username textbox is not displaying");
			  Assert.assertTrue(PasswordTextBox.isDisplayed(), "Password Text Box is not displaying");
			  Assert.assertTrue(LogInButton.isDisplayed(), "Log In Buttonis not displaying");
			  
		  } 
		  @Test(priority=3)
		  public void verifyingFacebookPageTitle1()
		  {
			   String expectedTitle="Facebook – log in or sign up";
			   String actualResult=driver.getTitle();
			   Assert.assertEquals(actualResult, expectedTitle, "Expected and Actual titles are not matching");
			  
		  }
		  
		  @Test(priority=4)
		  public void verifyingLoginFunctionality1()
		  {
			  WebElement UserNameTextBox=driver.findElement(By.xpath("//*[@id='email']"));
			  WebElement PasswordTextBox=driver.findElement(By.xpath("//*[@id='pass']"));
			  WebElement LogInButton=driver.findElement(By.xpath("//*[@name='login']"));
			  Assert.assertTrue(UserNameTextBox.isDisplayed(), "Username textbox is not displaying");
			  Assert.assertTrue(PasswordTextBox.isDisplayed(), "Password Text Box is not displaying");
			  Assert.assertTrue(LogInButton.isDisplayed(), "Log In Button is not displaying");
			  
		  } 

		  @AfterTest
		  public void tearDownConnection() 
		  {
			  driver.close();
		  }


}
