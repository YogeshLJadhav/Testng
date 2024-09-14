package Test_Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MultipleBrowser {
	WebDriver driver;
 
	@BeforeSuite
	public void LaunchBrowser () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		  ChromeOptions co=new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
	}
	@BeforeTest 
	public void ProductSearch() throws InterruptedException
	{
		WebElement Amazon=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Amazon.click();
		Amazon.sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
	}
	
@Test(priority=1)
  public void MobilePhone() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Thread.sleep(2000);
  }
@Test(priority=2)
public void Electronices()
{
	Set<String>handle=driver.getWindowHandles();
	Iterator<String> itr=handle.iterator();
	String ParentWindow=itr.next();
	String ChildWindow=itr.next();
	
	
	
	driver.switchTo().window(ChildWindow);
	driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[8]")).click();
	
	
}
@AfterTest
public void SignOut()
{
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
}

@AfterSuite
public void s()
{
	driver.quit();
}
}
