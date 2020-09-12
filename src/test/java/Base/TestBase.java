package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	protected WebDriver driver; 
    protected final static String base_url = "https://amazon.in";
    protected final static int implicit_wait = 10;
    
    @Before
        public void browser_setup()
    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
    
    @After
      public void clean()
      {
    	driver.quit();
      }


}
