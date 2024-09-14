package Test_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraTest {
  @Test
  public void Myntra () throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Users\\Automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		String ActualTitle= driver.getTitle();
		System.out.println("Actual Title"+ActualTitle);
		String ExpectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Expected Tile "+ ExpectedTitle);
		
  }
}
