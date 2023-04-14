package seleniumScripts;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class firstTest {
 

 
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://live.guru99.com/");
	 String expected_title="Home page";
	 String actual_title = driver.getTitle();
	 if(actual_title.equals(expected_title))
	 {
		 System.out.println("Title is verified successfully");
	 }
	 else
	 {
		 System.out.println("Title is not verified successfully"); 
	 }
	 WebElement mob = driver.findElement(By.xpath("//a[text()='Mobile']"));
	 mob.click();
	 Thread.sleep(3000);
	 String exp_title_mobile="Mobile";
	 String actual_title_mobile = driver.getTitle();
	 if(actual_title.equals(expected_title))
	 {
		 System.out.println("mobile page Title is verified successfully");
	 }
	 else
	 {
		 System.out.println("mobile page Title is not verified successfully"); 
	 }
	 WebElement sort=driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
	 Select a= new Select(sort);
	 //a.selectByIndex(1);
	 a.selectByVisibleText("Name");
	 Thread.sleep(3000);
	 
 
	 List<WebElement> b = driver.findElements(By.tagName("h2"));
	 for(WebElement c:b)
	 {
		String str= c.getText();
		System.out.println(str);
	 }
	 
	 Thread.sleep(4000);
	 driver.quit();
 }
	 
	
	 
	 
 }


