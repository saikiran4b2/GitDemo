package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Myfirst_pro 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Soft wares\\chromedriver_win32\\chromedriver.exe");
		/*ExtentReports R= new ExtentReports("D:\\exep.html");
		ExtentTest t=R.startTest("testName");
		WebDriver driver =new ChromeDriver();
		t.log(LogStatus.INFO, "It si browsing");
		driver.get("https://www.gmail.com");
		t.log(LogStatus.INFO, "App is running");
		String t2= driver.getTitle();
		if(t2.equalsIgnoreCase("facebook-login or signin")) {
			t.log(LogStatus.PASS, "matched");
			}
		else {
			t.log(LogStatus.FAIL, "Biscuit");
			R.endTest(t);
			R.flush();
		}}*/
		
		
		
		
		ExtentReports rep= new ExtentReports("D:\\extentrep.html");
		ExtentTest tes = rep.startTest("opening the application");
		WebDriver driver =new ChromeDriver();
		tes.log(LogStatus.INFO, "Browserstarted");
		driver.get("https://www.facebook.com");
		tes.log(LogStatus.INFO, "App is running");
		String tit= driver.getTitle();
		if(tit.equalsIgnoreCase("facebook")){
			tes.log(LogStatus.PASS, "Matched");
		}
		else {
				tes.log(LogStatus.FAIL, "not matched");
			}
		rep.endTest(tes);
		rep.flush();
		
		}}

