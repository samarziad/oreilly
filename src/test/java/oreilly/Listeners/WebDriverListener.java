package oreilly.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListener implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert accept");
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Alert accept");
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
		System.out.println("After  Alert dismiss");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert dismiss");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate to element ");
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("after navigate to element ");
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate to back ");
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before finding element ");
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("after finding  element ");
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before clicking  element ");
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("after clicking  element ");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("before changing value");
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("after changing value");
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
	
}
