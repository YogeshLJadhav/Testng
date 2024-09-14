package Test_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraTestCase {
	@Test
	public void Myntra_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("https://www.myntra.com/");
		 String ActualTitle=driver.getTitle();
		 System.out.println("Actual Title :"+ActualTitle);
		 
		 String ExpectedTitle="Online Shopping for Women, Men, Kids Fashion &amp; Lifestyle - Myntra";
		 System.out.println("ÉxpectedTitle :"+ExpectedTitle);
		 
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		 		
	}

}
