package American_Golf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prod1_buy_page {
	
	
	By Reserve_Button =  By.xpath("//*[@id='add-to-cart']");   
	
	By item_cart = By.xpath("//*[@id='mini-cart']/div[2]/div[1]/div/a/span[2]");                 
	
	private static WebDriver driver ;
	private static WebDriverWait wait ;
	
	//URL of the product page 
	public static String url = "http://www.americangolf.co.uk/golf-clubs/sets-of-irons/cobra-golf-fly-z-xl-ladies-4-5-hybrids-%26-graphite-irons-6-sw-279346.html" ;	
	public  String page_url = "http://www.americangolf.co.uk/golf-clubs/sets-of-irons/cobra-golf-fly-z-xl-ladies-4-5-hybrids-%26-graphite-irons-6-sw-279346.html" ;
	
	public prod1_buy_page(WebDriver driver)
	{
		this.driver =  driver ;
		if(!page_url.equals(driver.getCurrentUrl()))
		{
			throw new IllegalStateException("This is not a product page");
		}
	}
	
	
	public void click_reservre_Button()
	{
		driver.findElement(Reserve_Button).click();
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(item_cart) , "(1)"));
		
		
	}

}
