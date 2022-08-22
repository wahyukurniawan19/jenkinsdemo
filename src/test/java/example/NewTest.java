package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver webDriver = null;		
		@Test				
		public void testEasy() {	
			webDriver.get("http://www.google.com");  
			String title = webDriver.getTitle();	
		    Assert.assertTrue(title.contains("Google")); 	
			
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			//webDriver = new ChromeDriver();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("headless");
			webDriver = new ChromeDriver(opt);
			
		}		
		@AfterTest
		public void afterTest() {
			webDriver.quit();			
		}

}
