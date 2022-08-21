package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver webDriver = null;		
		@Test				
		public void testEasy() {	
			webDriver.get("http://demo.guru99.com/test/guru99home/");  
			String title = webDriver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
			
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			webDriver = new ChromeDriver();
			
		}		
		@AfterTest
		public void afterTest() {
			webDriver.quit();			
		}

}
