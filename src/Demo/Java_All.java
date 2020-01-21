package Demo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Java_All 
{
	static ChromeOptions opt;

	public static void main(String[] args) throws Throwable   
	{
		System.setProperty("webdriver.chrome.driver","E:\\Soft wares\\chromedriver_win32\\chromedriver.exe");
		//ExtentReports
		ExtentReports Reports=new ExtentReports("D://reports_001.HTML");
		ExtentTest Test=Reports.startTest("Browser started");
		opt=new ChromeOptions();
		opt.addArguments("--disable-notifications--");
		WebDriver driver =new ChromeDriver();
		Test.log(LogStatus.INFO,"Opening the application");
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("saikiran003@ymail.com");
		driver.findElement(By.id("pass")).sendKeys("saikiran@4b2");
		driver.findElement(By.id("loginbutton")).click();
		Test.log(LogStatus.INFO,"login sucessfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.close();
		Test.log(LogStatus.INFO,"Application closed");
//		WebDriver driver1 =new ChromeDriver();
		
		Test.log(LogStatus.INFO,"Entering Multiwindow ");
		driver.navigate().to("https://www.google.com/intl/en_in/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		
		
		//Multi window handling 
		Object obj []=driver.getWindowHandles().toArray();
		String win1 = obj[0].toString();
		String win2 = obj[1].toString();
		System.out.println(win1);
		System.out.println(win2);
		driver.switchTo().window(win2);
		driver.findElement(By.id("identifierId")).sendKeys("saikiran.vangapalli@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("9985957535");
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span/span")).click();
		Thread.sleep(3000);
		Test.log(LogStatus.INFO,"No of links");
		//No of links in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The no of links in the page are :" +links.size());
		for (WebElement i:links)
		{
//			driver.navigate().refresh();
			System.out.println(i.getText());
		}
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
//		Taking Screenshot
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File fdest=new File("D:\\Testing tools\\Programs\\Snapshot.jpg");
		FileUtils.copyFile(fsource,fdest);
//		EXPLICIT WAIT
		WebDriverWait w=new WebDriverWait(driver,10);
		System.out.println("WELCOME TO SAIKIRAN PC");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\':lc\']/div/div[2]/span/a"))).click();;
		System.out.println("HIII");
		//Mouse hover 
		WebElement ele =driver.findElement(By.xpath("//*[@id=\':l5\']/div/div"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Reports.endTest(Test);
		Reports.flush();
//		Drag & Drop
		WebDriver driver1 =new ChromeDriver();
		driver1.get("http://demo.guru99.com/test/drag_drop.html");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("https://www.google.com");
		WebElement x , y ;
		x=driver1.findElement(By.xpath("//*[@id='bank']/li"));
		y=driver1.findElement(By.xpath("//*[@id='bank']/li"));					
		Actions act =new Actions(driver1);
		act.dragAndDrop(x,y);
		act.build().perform();
	}

}
