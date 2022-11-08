package POM_Schnieder.Assignment_Graas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Price_page {
	@FindBy(xpath="(//select[@id=\"sorter\"])[1]")private WebElement Price_sort;
	@FindBy(xpath="(//a[@class=\"action sorter-action sort-desc\"])[1]") private WebElement Ascending_sort;
	@FindBy(xpath="(//a[@class=\"action sorter-action sort-desc\"])[1]") private WebElement Descending_sort;
    

	
	public void Selectdropdown() {
		Select drop = new Select(Price_sort);
		drop.selectByVisibleText("Price");
	}
	public void Ascending() {
		Ascending_sort.click();
	}
	public void Descending() {
		Descending_sort.click();
		
	}

}
