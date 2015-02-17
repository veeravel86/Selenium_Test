package American_Golf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class All_Golfers_Frame  {
	
	private final WebElement element ;
	private final WebDriver driver ;
	
	
	
	//Locator of ALL_Golfers_frame
	
	By ALL_Golfers_frame = By.xpath("//*[@id='CLUBS_1']/div[1]/ul[3]/li/ul/li[2]/ul");
	By Link_on_ALL_Golfers_frame = By.xpath("//*[@id='CLUBS_1']/div[1]/ul[1]/li/ul/li[2]/ul/li[1]/a");
			
			

	public  All_Golfers_Frame(WebDriver driver) {
		// TODO Auto-generated method stub
		
	    this.driver = driver ;
		this.element = driver.findElement(ALL_Golfers_frame) ;
		
		if (this.element == null)
		{
			throw new IllegalStateException("This is not the frame");
		}
		
		
       
     
	}



	 public Set_Of_Irons_page Click_link_on_frame()
     {
     	element.findElement(Link_on_ALL_Golfers_frame).click();
     	return new Set_Of_Irons_page(driver);
     }

}
