package mavenlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumTest {
	ExtentReports extent;
	
	
//	@Test
//	public void BroswerAutomation()
//	{
//		System.out.println("BroswerAutomation");
//	}
//
//	@Test
//	public void elementsUI()
//	{
//		System.out.println("elementsUI");	
//	}
//	
	
	@BeforeTest
	public void config()
	{
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter  = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Suriya");
		
	}
	@Test
	public void ExtentReportDemo()
	{
		ExtentTest test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tsuri\\eclipse-workspace\\mavenjava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		test.fail("just did for test");
		extent.flush();
		
	
	}
	
	
	
	}
	
	

