package TestMvnPkg.TestMvnProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{
	@Test
	public void Test_maven()
	{
		WebDriver fd = new FirefoxDriver();
		fd.get("https://www.google.se");
		Assert.assertEquals(true, true);
	}

}
