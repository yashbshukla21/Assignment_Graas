package Com.Mandatory_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {
	
	
	public static void Screenshot (WebDriver driver, String FileName) throws IOException
	{
   TakesScreenshot screen=(TakesScreenshot)driver;
		
		
		File src=screen.getScreenshotAs(OutputType.FILE);
		
		
		File dest= new File("C:\\Users\\SHRI\\eclipse-workspace\\Assignment_Graas\\Screenshot"+ FileName +".jpg");

		
		FileHandler.copy(src, dest);
		

	}

}
