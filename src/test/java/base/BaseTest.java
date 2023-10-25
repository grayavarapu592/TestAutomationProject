package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static FileReader fReader;
	public static Properties properties = new Properties();;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			//FileReader fReader = new FileReader("C:\\Users\\ganesh.rayavarapu\\eclipse-workspace\\TestAutomationProject\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			
			properties.load(fReader);
		}
		
		if(properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get(properties.getProperty("testurl"));
		}
		
		else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get(properties.getProperty("testurl"));
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("TearDown successful");

		
	}

}
