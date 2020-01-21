package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class My_samplereport 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Soft wares\\chromedriver_win32\\chromedriver.exe" );
		
		ExtentReports Reports=new ExtentReports("D://SAI.HTML");
		
		ExtentTest Test=Reports.startTest("Opening the application");
		
		
		WebDriver driver=new ChromeDriver();
		
		Test.log(LogStatus.INFO,"Browser started");
		
		driver.get("https://www.facebook.com");
		
		Test.log(LogStatus.INFO,"Application Started");
		
		String Title = driver.getTitle();
			
		if (Title.equalsIgnoreCase(Title))
			{
				Test.log(LogStatus.PASS,"Matched");
			}
			else
			{
				Test.log(LogStatus.FAIL,"Not matched");
			}
		
		Reports.endTest(Test);
		
		Reports.flush();
		
	}


}
