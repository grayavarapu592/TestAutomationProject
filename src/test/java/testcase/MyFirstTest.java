package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://zoho.com/");
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("clicked on signin");
		//Thread.sleep(2000);
		driver.findElement(By.id("login_id")).sendKeys("rcvtutorials@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn']//child::span")).click();
		System.out.println("clicked on next");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testautomation@123");
		String inputText = "testautomation@123";
		WebElement myElement = driver.findElement(By.xpath("//input[@id='password']"));
		String js = "arguments[0].setAttribute('value','"+inputText+"')";
		((JavascriptExecutor) driver).executeScript(js, myElement);
		System.out.println("entered password");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign In')]")).click();
		

	}

}
