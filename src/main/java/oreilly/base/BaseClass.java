package oreilly.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver= null;
	public static Properties prop ; 
	
	
	public void setUp() throws IOException {
		  prop =new Properties();
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Documents\\oreilly\\src\\main\\java\\config\\properties\\confiProperties");
		prop.load(fileInputStream);
		//System.out.print(prop.getProperty("browser"));

		if (prop.getProperty("browser").contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--no-sandbox");
			 options.addArguments("--headless"); //should be enabled for Jenkins
			 options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
			 options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins
			 driver = new ChromeDriver(options);
			
		        
		}else if (prop.getProperty("browser").contains("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	
	}

	
	public void Close() {
		driver.close();
	}
}

