package oreilly.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import oreilly.base.BaseClass;
import oreilly.objects.LoginPage;
import utility.TestUtils;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
 
	
	@Test( dataProvider ="testData")
	public void LoginApp(String username ,String password) throws IOException {
		setUp();
	    loginPage= new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.ClickLogin();
		assertEquals(loginPage.isDisbled(), true,"the login test is passed");
		Close();
	}
	
	
	/*	@Test(priority =2 ,groups= {"HappySenareo"})
		public void LoginApp2() throws IOException {
			//LoginPage loginPage= new LoginPage(driver);
			loginPage.setUsername("mngr281365");
			loginPage.setPassword("agUtAsy");
			loginPage.ClickLogin();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			assertEquals(loginPage.isDisbled(), true,"the login test is passed");
			Close();
		}
	
	*/
	
	@DataProvider
	public Object[][]  testData() throws IOException {
		Object data [][]= TestUtils.getSheetData(prop.getProperty("filepath"), "Sheet1");
		return data;
	}

}
