package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CommonObject {
	
	private WebDriver driver;
	
	private By searchbox_forProducts = By.id("twotabsearchtextbox");
	private By search_button = By.xpath("//input[@value='Go']");
	private By nav_link_cart =  By.id("nav-cart");
	private By nav_link_logo =  By.xpath("//a[@class='nav-logo-link']");
	private By nav_link_orders =  By.id("nav-orders");
 
public CommonObject(WebDriver driver)
{
	this.driver = driver;
}

public void setsearchbox(String text)
{
	boolean b = driver.findElement(searchbox_forProducts).isDisplayed();
	Assert.assertEquals("search box", true, b);
	driver.findElement(searchbox_forProducts).sendKeys(text);	
}

public void clickonsearchbutton()
{
	driver.findElement(search_button).click();
}

public void websitelogo()
{
	boolean b = driver.findElement(nav_link_logo).isDisplayed();
	Assert.assertEquals("amazon logo", true, b);
}

public void orderbutton()
{
	boolean b = driver.findElement(nav_link_orders).isDisplayed();
	Assert.assertEquals("Order button", true, b);
}




	
	
		
	
}


