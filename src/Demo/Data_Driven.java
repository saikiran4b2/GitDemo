package Demo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven 
{
	static int rows;
	public static void main(String[] args, WebElement webelement) throws IOException   
	{
		System.setProperty("webdriver.chrome.driver","E:\\Soft wares\\chromedriver_win32\\chromedriver.exe");
		XSSFWorkbook wb=new XSSFWorkbook("E:\\Programs\\sample.xlsx");
		  XSSFSheet ws=wb.getSheet("sheet1");
		   rows=ws.getLastRowNum();
		   rows=ws.getPhysicalNumberOfRows();
		   WebDriver driver =new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   for(int i=0;i<=rows;i++)
			  {
				  
				String Name1 = ws.getRow(i).getCell(0).getStringCellValue();
				 String Name2 = ws.getRow(i).getCell(1).getStringCellValue();
				  
			  }
		   WebElement txt=driver.findElement(By.id("email"));
		   WebElement txt1=driver.findElement(By.id("pass"));
		   txt.clear();
		   txt1.clear();
		   
	}

}
