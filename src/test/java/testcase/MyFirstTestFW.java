package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass = ReadXLSdata.class,dataProvider = "bvtdata")
	public static void LoginTest(String username, String password) throws InterruptedException{
	
	driver.findElement(By.linkText("Sign in")).click();
	System.out.println("clicked on signin");
	Thread.sleep(4000);
	driver.findElement(By.id("login_id")).sendKeys(username);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	System.out.println("clicked on next");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(), 'Sign in')]")).click();
	Thread.sleep(8000);
	
	

}
	
/*
 * @DataProvider(name="testdata") public Object[][] tData(){ return new
 * Object[][] { {"user1", "password1"}, {"user2", "password2"},
 * {"ganesh.qatester@gmail.com", "Zohoautomation@1"}
 * 
 * }; }
 */
}