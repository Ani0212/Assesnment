package OBJ_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page 
{
	WebDriver driver;
	public Registration_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@id,'registerPatient')]")
	WebElement RegiterPatient;
	
	@FindBy(name="givenName")
	private WebElement Name;
	
	@FindBy(name="familyName")
	private WebElement FamilyName;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement Nextbutton;
		
	@FindBy(xpath="//select[@id=\"gender-field\"]/option[text()='Male']")
	private WebElement Gender;
	
	@FindBy(id="birthdateLabel")
	private WebElement ClickonBirthday;
	
	@FindBy(id="birthdateDay-field")
	private WebElement ClickonBirthdayDate;
	
	@FindBy(id="birthdateMonth-field")
	private WebElement ClickonBirthdayMonth;
	
	@FindBy(id="birthdateYear-field")
	private WebElement ClickonBirthdayYear;
	
	@FindBy(xpath="//span[text()='Address']")
	private WebElement ClickonAddress;
	
	@FindBy(id="address1")
	private WebElement ClickonAddress1;
	
	@FindBy(id="address2")
	private WebElement ClickonAddress2;
	
	@FindBy(id="cityVillage")
	private WebElement ClickonAddressCity_village;
	
	@FindBy(id="stateProvince")
	private WebElement ClickonAddressState_province;
	
	@FindBy(id="country")
	private WebElement ClickonAddressCountry;
	
	@FindBy(id="postalCode")
	private WebElement ClickonAddressPostalcode;
	
	@FindBy(xpath="//span[text()='Phone Number']")
	private WebElement ClickonPhonenumber;
	
	@FindBy(name="phoneNumber")
	private WebElement EnterPhonenumber;

	@FindBy(xpath="//span[text()='Relatives']")
	private WebElement clickonRelative;
	
	@FindBy(xpath="//select[@id='relationship_type']")
	private WebElement SelectRelationType;
	
	@FindBy(xpath="//input[contains(@class,'person')]")
	private WebElement providePersonName;
	
	@FindBy(xpath="//span[@id='confirmation_label']")
	private WebElement clickonconfirm;
	@FindBy(id="submit")
	private WebElement clickonconfirmSubmit;
	
	public WebElement getRegiterPatient() {
		return RegiterPatient;
	}
	public WebElement getName() {
		return Name;
	}
	public WebElement getFamilyName() {
		return FamilyName;
	}
	public WebElement getNextbutton() {
		return Nextbutton;
	}
	public WebElement getGender() {
		return Gender;
	}
	public WebElement getClickonBirthday() {
		return ClickonBirthday;
	}
	public WebElement getClickonBirthdayDate() {
		return ClickonBirthdayDate;
	}
	public WebElement getClickonBirthdayMonth() {
		return ClickonBirthdayMonth;
	}
	public WebElement getClickonBirthdayYear() {
		return ClickonBirthdayYear;
	}
	public WebElement getClickonAddress1() {
		return ClickonAddress1;
	}
	public WebElement getClickonAddress2() {
		return ClickonAddress2;
	}
	public WebElement getClickonAddressCity_village() {
		return ClickonAddressCity_village;
	}
	public WebElement getClickonAddressState_province() {
		return ClickonAddressState_province;
	}
	public WebElement getClickonAddressCountry() {
		return ClickonAddressCountry;
	}
	public WebElement getClickonAddressPostalcode() {
		return ClickonAddressPostalcode;
	}
	public WebElement getClickonPhonenumber() {
		return ClickonPhonenumber;
	}
	public WebElement getclickonRelative() {
		return clickonRelative;
	}
	public WebElement getSelectRelationType() {
		return SelectRelationType;
	}
	public WebElement getprovidePersonName() {
		return providePersonName;
	}
	public WebElement getclickonconfirm() {
		return clickonconfirm;
	}
	public WebElement getclickonconfirmSubmit() {
		return clickonconfirmSubmit;
	}
	
}

