package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static String url = "https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;
	
	@BeforeTest
	public static void start() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.get(url);
		
		//implicit weight
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//explicit wait
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		driver.manage().window().maximize();

	}

	//@AfterTest
	public static void end() {

		driver.quit();

	}
	
}
