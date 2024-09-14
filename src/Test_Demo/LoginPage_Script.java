package Test_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Script 
{
   WebDriver driver;
   public LoginPage_Script(WebDriver driver)
   {
	 this.driver=driver;  
   }
   //Repository of webelement
   
   By username=By.name("user-name");
   By password=By.name("password");
   By login=By.xpath("//input[@type='submit']");
   
   //Repository method
   public void url() throws InterruptedException
   {
	   driver.get("https://www.saucedemo.com/");
	   Thread.sleep(2000);
	   
	   
   }
   public void UserName(String un) 
   {
	 driver.findElement(username).sendKeys(un);  
   }
   public void PassWord(String ps)
   {
	driver.findElement(password).sendKeys(ps);   
   
   }
   public void LoginBtn()
   {
	   driver.findElement(login).click();
   }
   public void LoginPageM(String un,String ps) throws InterruptedException
   {
	   url();
	   UserName(un);
	  
	   PassWord(ps);
	   LoginBtn();
   }
   }
