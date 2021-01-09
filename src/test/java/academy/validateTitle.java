package academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class validateTitle extends Base {
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		//l.getTitle().getText();
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
}
