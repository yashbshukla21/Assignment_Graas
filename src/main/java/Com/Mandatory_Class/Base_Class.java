package Com.Mandatory_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
	public WebDriver driver;
	
	public void configurebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRI\\eclipse-workspace\\Assignment_Graas\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://shop.schneider-electric.co.in/shop-by-category/ups-and-stabilizers.html");
		
	    Thread.sleep(2000);
		
	}
	

	}
