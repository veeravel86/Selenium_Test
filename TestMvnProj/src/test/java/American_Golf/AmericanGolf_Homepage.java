package American_Golf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmericanGolf_Homepage {
	
	private final WebDriver driver;
	
	
	//Homepage URL of American Golfat
	private String  home_page_url = "http://www.americangolf.co.uk/" ; 
	public static String static_homepage_url =  "http://www.americangolf.co.uk/" ;
	
   //Locators of all elements in American_Golf_Home_Page
	By Golf_Club_Link = By.xpath("//*[@id='navigation']/nav/ul/li[1]/a") ;
	
	
	// Setting the american golf class constructor 
	public AmericanGolf_Homepage(WebDriver driver) {
        this.driver = driver;

        
        
        // Check that we're on the right page.
        if (!home_page_url.equals(driver.getCurrentUrl())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
            
            
        }
	}
	
	//Method to move the mouse to "Golf clubs" link
	
	public  All_Golfers_Frame move_mouse_to_GolfClubs()
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(Golf_Club_Link)).build().perform();
		return new All_Golfers_Frame(driver);
	}
	
	
	
}
