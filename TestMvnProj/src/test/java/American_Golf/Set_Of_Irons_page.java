package American_Golf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Set_Of_Irons_page {
	
	
	private final WebDriver driver;
	
	//Search result_Container
	By search_result_container = By.xpath("//*[@id='primary']/div[3]") ;
	
	//product Container in search result container 
	By product1_container =  By.xpath("//*[@id='bdbgIiaagZhK2aaadhag6T87bb']/div/div[2]") ;
	
	//First product Button
	By first_product_button = By.xpath("//*[@id='bdbgIiaagZhK2aaadhag6T87bb']/div/div[2]/div[6]/a/span") ;
			
			
				
		
	//Homepage URL of American Golfat
		private String  set_of_irons_page_url = "http://www.americangolf.co.uk/golf-clubs/sets-of-irons" ;
		
		//public static String static_set_of_irons_page_url  =  "http://www.americangolf.co.uk/golf-clubs/sets-of-irons" ;

		
		public Set_Of_Irons_page(WebDriver driver)
		{
			this.driver = driver;
			
			 // Check that we're on the right page.
	        if (!set_of_irons_page_url.equals(driver.getCurrentUrl())) 
	        
	          {
	            // Alternatively, we could navigate to the login page, perhaps logging out first
	            throw new IllegalStateException("This is not the Set of Irons page");
	            
		      }
	        
		}
		
		public prod1_buy_page click_product_1()
		{
			driver.findElement(first_product_button).click();
			return new prod1_buy_page(driver);
		}
		
}
