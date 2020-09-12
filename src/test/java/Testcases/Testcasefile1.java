package Testcases;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import PageObject.CommonObject;
import PageObject.ProductDescriptionPageObject;
import PageObject.SearchResultPageObjects;
import junit.framework.Assert;

public class Testcasefile1 extends TestBase{
	
   
	/*@Test
    public void t_01_check_website_title_checking(){
	driver.get(base_url);	
    String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    String actual = driver.getTitle();
    Assert.assertEquals(expected, actual);
	}*/
    
    @Test
    public void productrelatedtestcases()
    {
    	driver.get(base_url);
    	CommonObject obj1 = new CommonObject(driver);
    	obj1.setsearchbox("earphone");
    	obj1.clickonsearchbutton();
    	Assert.assertEquals("Amazon.in : earphone", driver.getTitle());
    	
    }
    
    /*@Test
    public void searchresult()
    {
    	SearchResultPageObjects obj3 = new SearchResultPageObjects(driver);
    	obj3.clickonproduct();
    	
    }*/
    
  /*  @Test
    public void productdescriptiontestcases()
    {
    	driver.get(base_url);
    	ProductDescriptionPageObject obj2 = new ProductDescriptionPageObject(driver);
    	obj2.checkingaddtocart();
    	obj2.checkingprocuctquantity();
    	obj2.checkingaddtocart();
    	
    }
    
*/
}

	

