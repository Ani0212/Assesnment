package Generic_Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public WebDriverUtils wLib = new WebDriverUtils();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public propertiesfileUtility pLib = new propertiesfileUtility();
	public WebDriver driver;
	public static WebDriver staticDriver;
	
	/*@BeforeSuite()
	public void makeDBConnection() throws Throwable
	{
		//dLib.connectToDB();
		System.out.println("========make database connection=====");
	}*/
	
	@BeforeClass()
	public void launchBrowser() throws Throwable
	{
		String BROWSER = pLib.readDatafromProperrtyFile("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new InternetExplorerDriver();
		}
		
	}
	
	
	@BeforeMethod()
	public void loginTtoApp() throws Throwable
	{
		
		String URL = pLib.readDatafromProperrtyFile("url");
		String USERNAME = pLib.readDatafromProperrtyFile("username");
		String PASSWORD = pLib.readDatafromProperrtyFile("password");
		
		
		wLib.waitForPageToLoad(driver);
		driver.get(URL);
		wLib.maximiseWin(driver);
		
		driver.findElement(By.id("username")).sendKeys(USERNAME);
	    driver.findElement(By.id("password")).sendKeys(PASSWORD);
	    driver.findElement(By.id("Laboratory")).click();
	    driver.findElement(By.id("loginButton")).click();
	}
	
	
    @AfterMethod()
    public void logoutOfApp()
    {
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		    
    }
    
    @AfterClass()
    public void closeBrowser()
    {
    	driver.close();
    }
    
    /*@AfterSuite()
    public void closeDB() throws Throwable
    {
    	//dLib.closeDB();
    	System.out.println("=====close the DB connection======");
    }*/

}
