package facebook;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

	public class FBLogin{
	    WebDriver driver;
	    
	    @Test(priority=1)
		void openapp()
		{
	    	driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}
	    
	   @Test(priority=2)
		void fblogo() throws InterruptedException 
		{
	    	Thread.sleep(3000);
	    	
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		   System.out.println("logo displayed....");
		}
	    
	   @Test(priority=3)
	  	void fblogin() 
	  	{    
		   
	  		driver.findElement(By.id("email")).sendKeys("swara@123");
	  		driver.findElement(By.id("pass")).sendKeys("swara");
	  		//driver.findElement(By.id("u_0_5_Fp")).click();
	  	}
	   @Test(priority=4)
		void fblogout()
		{
			driver.quit();
		}
		
	}
		
		

