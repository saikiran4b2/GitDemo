package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Mysecond_Report 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Soft wares\\\\chromedriver_win32\\\\chromedriver.exe");
		
//		ExtentReports rep=new ExtentReports("D://Second_report");
//		
//		ExtentTest temp=rep.startTest("Flipkart login verification");
		
		WebDriver driver = new ChromeDriver();
		
		//temp.log(LogStatus.INFO,"Browser started");
		
		driver.get("http://www.flipkart.com");
		
		//temp.log(LogStatus.INFO,"Flipkart site is opened");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement mouse;
		mouse=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[3]/div/a"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).build().perform();
		mouse.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9985957535");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("saikiran4b2");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		
		//temp.log(LogStatus.INFO,"Passing the values");
			

	}

}
