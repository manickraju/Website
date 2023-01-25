package aiite.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	
	
public static WebDriver driver;
	
	@BeforeClass
	
		public static void browserlaunch() {
		
		//Reports
		
		reporter =new ExtentHtmlReporter("./junitdemoreport.html");
		extent  =new ExtentReports();
		extent.attachReporter(reporter);
		
		//Browser Launch
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@After
	public void after() {
		extent.flush();
	}
		public static void type(WebElement element,String data) {
		
element.sendKeys(data);
	}
	//@AfterClass
	public static void close() {
		driver.close();
	}
public static void click(WebElement element) {
	element.click();
}

public static void roboclass() {
	 try {
		Robot rb=new Robot();
	} catch (AWTException e) {
		e.printStackTrace();
	}
}
}


