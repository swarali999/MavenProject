package multipleclass;


	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Test1 {
		
		     @Test
			void ABC()
			{
				System.out.println(" this is abc from T1");
			}
			
			@BeforeTest
			void bt()
			{
				System.out.println("this is before test");
			}
		}



