package Test_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class Flipcart {
	WebDriver driver;
	 @BeforeSuite
	  public void beforeSuite() throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","D:\\Users\\Automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
	  }
  
  @BeforeTest
  public void ProductSearch() throws InterruptedException {
	 WebElement Flipkard= driver.findElement(By.xpath("//input[@type='text']"));
	 Flipkard.click();
	 Flipkard.sendKeys("Mobile");
	 driver.findElement(By.xpath("//input[@type='text']")).click();
	 Thread.sleep(2000);
  }
  @Test
  public void Mobile() throws InterruptedException {
	  driver.findElement(By.xpath("//div[@class='KzDlHZ']")).click();
	  Thread.sleep(2000);
  }

  @Test
  public void Electronice() throws InterruptedException
  {
	  Set<String> handle=driver.getWindowHandles();
	  Iterator<String> itr= handle.iterator();
	  String ParentWindow=itr.next();
	  String ChildWindow=itr.next();
	  
	  driver.switchTo().window(ChildWindow);
	  driver.findElement(By.xpath("//span[@class='TSD49J']")).click();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void Logout() {
	  driver.findElement(By.xpath("//a[@class='wsejfv']")).click();
  }
  @AfterSuite
  public void CloseBrowser()
  {
	driver.quit();  
  }

}
