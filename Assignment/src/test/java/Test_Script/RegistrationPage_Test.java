package Test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Generic_Repository.BaseClass;
import OBJ_Repository.Home_page;
import OBJ_Repository.Registration_Page;


public class RegistrationPage_Test extends BaseClass {
	WebDriver driver;
	WebElement element;
	@Test
	public void RegistrationPageTest() throws Throwable
	{
		
		Home_page hp= PageFactory.initElements(driver, Home_page.class);
		hp.getRegiterPatient().click();
		Registration_Page reg= PageFactory.initElements(driver, Registration_Page.class);
		String PatientNameName = eLib.getExcelData("sheet1",1,3);
		String FamilyName = eLib.getExcelData("sheet1", 1,4);
		String Bithtdate = eLib.getExcelData("sheet1",1,5);
		String BirthMonth= eLib.getExcelData("Sheet", 1,6);
		String BirthYear = eLib.getExcelData("sheet1",1,7);
		String Addres1 = eLib.getExcelData("sheet1",1,8);
		String Addres2 = eLib.getExcelData("sheet1",1,9);
		String City = eLib.getExcelData("sheet1",1,10);
		String State = eLib.getExcelData("sheet1",1,11);
		String Country = eLib.getExcelData("sheet1",1,12);
		String PostalCode = eLib.getExcelData("sheet1",1,13);
		String Phone = eLib.getExcelData("sheet1",1,14);
		String Relative = eLib.getExcelData("sheet1",1,15);
		String PersonName= eLib.getExcelData("sheet1",1,16);
		
		reg.getName().sendKeys(PatientNameName);
		reg.getFamilyName().sendKeys(FamilyName);
		reg.getNextbutton().click();
		reg.getGender().click();
		reg.getClickonBirthday().click();
		reg.getClickonBirthdayDate().sendKeys(Bithtdate);
		element= reg.getClickonBirthdayMonth();
		//element= driver.findElement(By.xpath("//select[@id='birthdateMonth-field']"));
		Select S= new Select(element);
		S.selectByVisibleText(BirthMonth);
		reg.getClickonBirthdayYear().sendKeys(BirthYear);
		reg.getClickonAddress1().click();
		reg.getClickonAddress1().sendKeys(Addres1);
		reg.getClickonAddress2().sendKeys(Addres2);
		reg.getClickonAddressCity_village().sendKeys(City);
		reg.getClickonAddressState_province().sendKeys(State);
		reg.getClickonAddressCountry().sendKeys(Country);
		reg.getClickonAddressPostalcode().sendKeys(PostalCode);	
		reg.getClickonPhonenumber().sendKeys(Phone);
		reg.getclickonRelative().click();
		element= reg.getSelectRelationType();
		Select S1= new Select(element);
		S1.selectByVisibleText(Relative);
		reg.getprovidePersonName().sendKeys(PersonName);
		reg.getclickonconfirm().click();
		reg.getclickonconfirmSubmit().click();
		
	}

}
