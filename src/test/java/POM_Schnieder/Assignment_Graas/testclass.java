package POM_Schnieder.Assignment_Graas;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Mandatory_Class.Base_Class;
import Com.Mandatory_Class.Utility_Class;

public class testclass extends Base_Class{

	Product_Page product;
	@BeforeClass
	public void openapp() throws InterruptedException {
		configurebrowser();
		product = new Product_Page(driver);
		}
	@Test
	public void clickonproduct() throws InterruptedException, IOException {
		product.Selectdropdown();
		product.Ascending();
		product.Descending();
		product.Selectdropdownprice();
		product.Ascendingprice();
		product.Descendingprice();
		
		String expected_url = "shop.schneider-electric.co.in/shop-by-category/ups-and-stabilizers.html?product_list_order=name&product_list_dir=desc";
        String current_url = driver.getCurrentUrl();
 
        Assert.assertTrue(expected_url.equals(current_url), "URL does not match\n");
        Thread.sleep(2000);
        System.out.println("AssertTrue Test Passed\n");
        
        Utility_Class.Screenshot(driver, "url verified");
        
       }
	
	@AfterClass
	public void closeapp() {
		driver.quit();
	}
	
	
	    
	
		

	

}
