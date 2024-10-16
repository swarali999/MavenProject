package multipleclass;


	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;

	public class Test2 {

		 @Test
			void XYZ()
			{
				System.out.println(" this is xyz from T2");
			}
			
			@AfterTest
			void at()
			{
				System.out.println("this is after test");
			}
		}



