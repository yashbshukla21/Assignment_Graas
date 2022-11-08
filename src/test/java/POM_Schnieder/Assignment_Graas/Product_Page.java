package POM_Schnieder.Assignment_Graas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product_Page {
	
	@FindBy(xpath="(//select[@id=\"sorter\"])[1]")private WebElement Product_sort;
	@FindBy(xpath="(//select[@id=\"sorter\"])[1]")private WebElement Price_sort;

	
	@FindBy(xpath="(//a[@title=\"Set Descending Direction\" and @class=\"action sorter-action sort-asc\"])[1]") private WebElement Ascending_sort;
	@FindBy(xpath="(//a[@class=\"action sorter-action sort-desc\"])[1]") private WebElement Descending_sort;
    public Product_Page(WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    }
    
	public void Selectdropdown() throws InterruptedException {
		Thread.sleep(2000);
		Select drop = new Select(Product_sort);
		drop.selectByVisibleText("Product Name");
	}
	public void Ascending() throws InterruptedException {
		Thread.sleep(5000);
		Ascending_sort.click();
	}
	public void Descending() throws InterruptedException {
		Thread.sleep(5000);
		
		Descending_sort.click();
		
	}
	public void Selectdropdownprice() throws InterruptedException {
		Thread.sleep(5000);
		Select drop = new Select(Price_sort);
		drop.selectByVisibleText("Price");
	}
	public void Ascendingprice() throws InterruptedException {
		Thread.sleep(5000);
		Ascending_sort.click();
	}
	public void Descendingprice() throws InterruptedException {
		Thread.sleep(5000);
		Descending_sort.click();
		
	}
	
	
	
}
