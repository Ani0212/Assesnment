package Test_Script;


import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic_Repository.BaseClass;

//import OBJ_Repository.Login_into_Open_Mrs;



public class Login_Page_Test extends BaseClass {
 WebDriver driver;
	@Test
	public void LoginPage() throws Throwable
	{
		
		//Login_into_Open_Mrs lp= PageFactory.initElements(driver, Login_into_Open_Mrs.class);
	
		/*propertiesfileUtility plib = new propertiesfileUtility();
		String url= plib.readDatafromProperrtyFile("url");
		String USERNAME = plib.readDatafromProperrtyFile("username");
		String PASWORD = plib.readDatafromProperrtyFile("password");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.get(USERNAME);
		driver.get(PASWORD);*/
	
	}
	
}
