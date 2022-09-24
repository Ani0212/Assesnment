package OBJ_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public Home_page(WebDriver driver)  //Rule-4 : Create Constructor to Initialize the Element
	{
		PageFactory.initElements(driver, this);
	}
	// click on Register Patient Page
	@FindBy(xpath="//a[contains(@id,'registerPatient')]")
	WebElement RegiterPatient;
	
	// click on Home image button
	
	@FindBy(xpath="//a//i[@class='icon-home small']")
	WebElement HomeImgButton;
	
	public WebElement getRegiterPatient() {
		return RegiterPatient;
	}
	public WebElement getHomeImgButton() {
		return HomeImgButton;
	}
	
}
