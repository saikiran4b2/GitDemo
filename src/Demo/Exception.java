package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception 
{

	public static void main(String[] args) 
	{
		try 
		{
			
		
		System.setProperty("webdriver.chrome.driver","E:\\Soft wares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Forgotten account")).click();
		}
		catch (NoSuchElementException e )
		{
			System.out.println("The given link text is wrong"+e);
		}
		
		
		
	}

}
