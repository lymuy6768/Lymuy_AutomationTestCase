package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class MyAccountRegistrationPage {

	public MyAccountRegistrationPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="reg_email")
	WebElement emailAddress;
}
