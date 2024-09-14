package Test_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\AutomationFiles\\Driver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
		 FileInputStream inputstream=new  FileInputStream(" D:/OrangeHRMFile.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		 XSSFSheet sheet=workbook.getSheet("Login");
		 
		 int rows=sheet.getLastRowNum();
		 System.out.println("Number of rows="+rows);
		 for(int r=1;r<=rows;r++)
		 {
			 XSSFRow row=sheet.getRow(r);
			 XSSFCell username=row.getCell(0);
			 XSSFCell password=row.getCell(1);
			 
			 System.out.println("Username is :"+username+" password:"+password);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input']"));
		 }
		 

	}

}
