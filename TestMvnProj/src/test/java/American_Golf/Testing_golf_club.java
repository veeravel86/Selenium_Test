package American_Golf;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing_golf_club {
	
	
	

	public static void main(String[] args) throws MalformedURLException {
		
		//Setting the Desired Capablity object to use firfox
		DesiredCapabilities capability =   DesiredCapabilities.chrome();
		//= DesiredCapabilities.firefox();
		
		//capability.setJavascriptEnabled(true);
		
				
		//Using the remote webdriver instance to set the grid in the code
		WebDriver fd = new RemoteWebDriver
				       (new URL("http://localhost:4444/wd/hub"), capability);
		
		
		// TODO Auto-generated method stub
		
		//WebDriver fd = new FirefoxDriver();
		fd.get(AmericanGolf_Homepage.static_homepage_url);
		AmericanGolf_Homepage homepage = new AmericanGolf_Homepage(fd);
		
		//Navigation to All_Golfers_Frame successfull
		All_Golfers_Frame agf = homepage.move_mouse_to_GolfClubs();
		//Set_Of_Irons_page x = agf.Click_link_on_frame() ;
		
		//Set_Of_Irons_page x = new Set_Of_Irons_page(fd);
		//x = agf.Click_link_on_frame() ;
		
		Set_Of_Irons_page x ;
		x = agf.Click_link_on_frame() ; 
		
		prod1_buy_page prod1_buy ;
		prod1_buy = x.click_product_1() ;
		
		//= x.click_product_1() ;
		
		prod1_buy.click_reservre_Button();
		
	}

}
