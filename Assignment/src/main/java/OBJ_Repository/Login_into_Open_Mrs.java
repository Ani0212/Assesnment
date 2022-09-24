package OBJ_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_into_Open_Mrs
{
	public Login_into_Open_Mrs(WebDriver driver)  //Rule-4 : Create Constructor to Initialize the Element
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="Laboratory")
	private WebElement Laboratory;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	
	public WebElement getusername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLaboratory() {
		return Laboratory;
	}
	public WebElement getloginbtn() {
		return loginbtn;
	}
	
	public void login(String username, String password) // Rule-5: In all testscripts Utilize the element using getter(), Business method.
	{
		Username.sendKeys(username);
		Password.sendKeys(password);
		loginbtn.click();
	}
}

