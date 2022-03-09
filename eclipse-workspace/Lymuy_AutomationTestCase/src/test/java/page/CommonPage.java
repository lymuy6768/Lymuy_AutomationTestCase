package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class CommonPage {
	
	public CommonPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="menu-item-40")
	public WebElement shopTap;
	
	@FindBy(id="menu-item-50")
	public WebElement myAccountTap;
	
	@FindBy(id="menu-item-224")
	public WebElement testCaseTap;
	
	@FindBy(id="menu-item-244")
	public WebElement atSiteTap;
	
	@FindBy(id="menu-item-251")
	public WebElement demoSiteTap;
	
	@FindBy(xpath="//*[@id=\"wpmenucartli\"]/a/span[1]")
	public WebElement cartItem;
	
	@FindBy(xpath="//*[@id=\"wpmenucartli\"]/a/span[2]")
	public WebElement amount;

}
