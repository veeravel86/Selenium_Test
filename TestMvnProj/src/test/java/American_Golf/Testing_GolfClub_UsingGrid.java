package American_Golf;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing_GolfClub_UsingGrid {
	
	public WebDriver driver;
	  //public String URL, Node;
	   protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	   
	@Parameters("browser")
	@BeforeTest
	public void setting_up_driver(String browser) throws MalformedURLException
	{
		if (browser.equalsIgnoreCase("firefox"))
	      {
	         System.out.println(" Executing on FireFox");
	         String Node = "http://localhost:5556/wd/hub";
	         DesiredCapabilities cap = DesiredCapabilities.firefox();
	         cap.setBrowserName("firefox");
	         
	         driver = new RemoteWebDriver
				       (new URL(Node), cap);
	         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         // Launch website
	         //driver.navigate().to(URL);
	         //driver.manage().window().maximize();
	      }
         
		if (browser.equalsIgnoreCase("chrome"))
	      {
	         System.out.println(" Executing on Chrome");
	         String Node = "http://localhost:5557/wd/hub";
	         
	         //System.setProperty("webdriver.chrome.driver","C:/selenium_practice/Drivers/chromedriver.exe");
	         DesiredCapabilities cap = DesiredCapabilities.chrome();
	         cap.setBrowserName("chrome");
	         
	         //cap.setBrowserName("chrome");
	         
	         driver = new RemoteWebDriver
				       (new URL(Node), cap);
	         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         // Launch website
	         //driver.navigate().to(URL);
	         //driver.manage().window().maximize();
	      }
		
		if (browser.equalsIgnoreCase("ie"))
	      {
	         System.out.println(" Executing on IE");
	         String Node = "http://localhost:5558/wd/hub";
	         
	         //System.setProperty("webdriver.chrome.driver","C:/selenium_practice/Drivers/chromedriver.exe");
	         DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	         cap.setBrowserName("ie");
	         
	         //cap.setBrowserName("chrome");
	         
	         driver = new RemoteWebDriver
				       (new URL(Node), cap);
	         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	         
	         driver.manage().window().maximize();
	         
	         // Launch website
	         //driver.navigate().to(URL);
	         //driver.manage().window().maximize();
	      }
	}
	
	
	@Test
	public void Test_Testing_Order_flow() throws InterruptedException
	{
		driver.get(AmericanGolf_Homepage.static_homepage_url);
		AmericanGolf_Homepage homepage = new AmericanGolf_Homepage(driver);
		
		//Navigation to All_Golfers_Frame successfull
		All_Golfers_Frame agf = homepage.move_mouse_to_GolfClubs();
		//Set_Of_Irons_page x = agf.Click_link_on_frame() ;
		
		//Set_Of_Irons_page x = new Set_Of_Irons_page(fd);
		//x = agf.Click_link_on_frame() ;
		
		Set_Of_Irons_page x ;
		x = agf.Click_link_on_frame() ; 
		
		//Thread.sleep(3000);
		
		//prod1_buy_page prod1_buy ;
		//prod1_buy = x.click_product_1() ;
		
		//= x.click_product_1() ;
		
		//Thread.sleep(3000);
		
		//prod1_buy.click_reservre_Button();
	}
	
	@AfterTest
	public void Test_close_driver()
	{
		driver.quit();
	}

}
