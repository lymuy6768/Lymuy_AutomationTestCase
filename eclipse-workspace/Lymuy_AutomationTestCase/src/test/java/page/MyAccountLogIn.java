package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class MyAccountLogIn {
	
	public MyAccountLogIn() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
	}

	@FindBy(id="username")
	WebElement userNameLogIn;
	
	@FindBy(id="password")
	WebElement logInPassword;
	
	@FindBy(name="login")
	WebElement logInButton;
	
	@FindBy(name="rememberme")
	WebElement rememberMe;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[4]/a")
	WebElement lossYourPassword;
	
	
}
