package driver;

import page.CommonPage;
import page.MyAccountLogIn;

public class PageInitializer extends Driver{
	
	public static CommonPage cp;
	public static MyAccountLogIn login;

	public static void initialize() {
		cp=new CommonPage();
		login= new MyAccountLogIn();
	
	}
}
