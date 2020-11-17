package oreilly.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ; 
	
	By usernameTxt = By.name("uid");
	
	By passwordTxt= By.name("password");
	
	By LoginBtn=By.name("btnLogin");
	
	By loginLogo = By.xpath("//img[@src='../images/1.gif\']");
	
	
	public LoginPage (WebDriver driver){
		this.driver=driver;
	}
	public void setUsername(String userName) {
		driver.findElement(usernameTxt).sendKeys(userName);
		
	}
	
	public void setPassword(String password) {
		driver.findElement(passwordTxt).sendKeys(password);
	}

	public void ClickLogin() {
		driver.findElement(LoginBtn).click();
	}
	public boolean isDisbled(){
	boolean result =driver.findElement(loginLogo).isDisplayed();
		return result ;
		
	}
}
