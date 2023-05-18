package BaseFunctionalities;

import org.openqa.selenium.By;

import base.Base;

public class OperationalMethods extends Base {

	public static void Sendkeys(By path, String data) {

		driver.findElement(path).sendKeys(data);

	}

	public static void Click(By path) {

		driver.findElement(path).click();

	}

	public static void SendAndClick(By path, String data) {
		driver.findElement(path).sendKeys(data);
//		action
	}
}
