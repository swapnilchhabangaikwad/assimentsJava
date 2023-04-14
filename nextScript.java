package seleniumScripts;



import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class nextScript {
 

 
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
	 WebElement cost1 = driver.findElement(By.xpath("//span[@id='product-price-1']/span"));
	 String sonycost1 = cost1.getText();
	 System.out.println(sonycost1);
	 driver.findElement(By.xpath("//a[text()='Sony Xperia']")).click();
	 
	 Thread.sleep(3000);
	 
	 WebElement cost2= driver.findElement(By.xpath("//span[@class='price']"));
      String sonycost2 = cost2.getText(); 
 	 System.out.println(sonycost2);

      if(sonycost1.equals(sonycost2))
      {
    	  System.out.println("Price verified successfully");
      }
      else {
    	  System.out.println("Price NOT verified successfully");

      }
      
      
 }
	
}	 
	 
 


