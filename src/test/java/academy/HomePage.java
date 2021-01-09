package academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException {
		
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("abc@gmail.com");
		lp.getPassword().sendKeys("1234");
		lp.getLogin().click();
		System.out.println(text);
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "nonrestricted@gmail,com";
		data[0][1]= "23450";
		data[0][2]= "Restricted user";
		
		  data[1][0] = "restricted@gmail,com"; 
		  data[1][1]= "253450"; 
		  data[1][2]="non-Restricted user";
		 
		return data;
		
		
	}

}
