package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class SearchResultPageObjects {
	
	private WebDriver driver;
	
	//private By productresult = By.className("a-size-medium a-text-italic");
	private By productresult= By.xpath("//span[contains(text(),'1-16 of over 50,000 results for')]");
	
	public SearchResultPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchresult() {
		boolean b = driver.findElement(productresult).isDisplayed();
		Assert.assertEquals("Result Tab",true, b);
	}
	
	public void clickonproduct()
	{
		driver.findElement(By.xpath("//span[class='-size-medium a-color-base a-text-normal']"));
	}
}
