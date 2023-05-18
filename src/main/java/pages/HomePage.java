package pages;

import java.util.Properties;

import org.openqa.selenium.By;

import BaseFunctionalities.OperationalMethods;
import base.Base;

public class HomePage extends Base{

	
	public static Properties prop;
	
	
	public static void FromAndTo() {
		
		By path = By.xpath(prop.getProperty("forOrigin"));
		
//		OperationalMethods.Sendkeys(path, )
		
	}
	
	
	
	
}
