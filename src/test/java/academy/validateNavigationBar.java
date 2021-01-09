package academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class validateNavigationBar extends Base {
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		//l.getNavigationBar().isDisplayed();
		//l.getTitle().getText();
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
}
