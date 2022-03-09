package TestCase;

import org.testng.annotations.BeforeMethod;

import driver.Driver;
import utilities.CommonMethods;

public class MyAccount_LogIn extends CommonMethods{
	
//1) Open the browser
//2) Enter the URL “http://practice.automationtesting.in/
	
	@BeforeMethod
	public void beforeTest() {
		Driver.getDriver();
	}
	
/*	”
	3) Click on My Account Menu
	4) Enter registered username in username textbox
	5) Enter password in password textbox
	6) Click on login button
	7) User must successfully login to the web page*/

}
