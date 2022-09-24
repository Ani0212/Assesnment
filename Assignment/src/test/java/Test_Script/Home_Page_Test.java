package Test_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic_Repository.BaseClass;
import OBJ_Repository.Home_page;

public class Home_Page_Test extends BaseClass
{
	WebDriver driver;
@Test
public void Homepage()
{
	
	Home_page hp= PageFactory.initElements(driver, Home_page.class);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	hp.getRegiterPatient().click();
}
}
