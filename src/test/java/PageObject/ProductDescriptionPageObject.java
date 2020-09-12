package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class ProductDescriptionPageObject {
	
	//Driver Initialization
	private WebDriver driver;
	
	//Defining all product related locators 
    private By Product = By.id("productTitle");
	private By ProductPrice = By.id("priceblock_ourprice_lbl");
	private By ProductBuy = By.id("buy-now-button");
	private By AddtoCart = By.id("add-to-cart-button");
	private By ProductQuantity = By.id("quantity");
	  
	
	//Constructor
	public ProductDescriptionPageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void validatingproducttitle()
	{
		boolean b = driver.findElement(Product).isDisplayed();
		Assert.assertEquals("product", true, b);
	}
	
	public void checkingproductprice()
	{
		boolean b = driver.findElement(ProductPrice).isDisplayed();
		Assert.assertEquals("price of product", true, b);
	}
    
	 public void checkingproductbuy()
	 {
		 boolean b = driver.findElement(ProductBuy).isDisplayed();
		 Assert.assertEquals("buy option", true, b);
	 }
	 
	 public void checkingaddtocart()
	 {
		 boolean b = driver.findElement(AddtoCart).isDisplayed();
		 Assert.assertEquals("Cart option", true, b);
		 driver.findElement(AddtoCart).click();
	 }
	 
	 public void checkingprocuctquantity()
	 {
		 boolean b = driver.findElement(ProductQuantity).isDisplayed();
		 Assert.assertEquals("Product Quantity", true, b);
	 }
	
	}

	
	
	
	
    
	
	
	
	



