package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Navigation_Test 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","E:\\Soft wares\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications--");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("https://www.google.com");
		WebElement x , y ;
		x=driver.findElement(By.xpath("//*[@id='bank']/li"));
		y=driver.findElement(By.xpath("//*[@id='bank']/li"));					
		Actions act =new Actions(driver);
		act.dragAndDrop(x,y);
		act.build().perform();
		
	}

}


/*
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;		
import org.testng.annotations.Test;		

public class DragAndDrop {				

    WebDriver driver;			

    @Test		
    public void DragnDrop()					
    {		
         System.setProperty("webdriver.chrome.driver"," E://Selenium//Selenium_Jars//chromedriver.exe ");					
         driver= new ChromeDriver();					
         driver.get("http://demo.guru99.com/test/drag_drop.html");					
         
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	}		
}
8*/