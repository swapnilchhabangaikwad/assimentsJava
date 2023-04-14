package seleniumScripts;



import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class errorValidation {
 

 
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://live.guru99.com/");
	 WebElement mob = driver.findElement(By.xpath("//a[text()='Mobile']"));
	 mob.click();
	 Thread.sleep(3000);
	 
	 WebElement addtocard = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]"));
	 addtocard.click();
	 
	 WebElement qty = driver.findElement(By.xpath("//input[@title='Qty']"));
	 qty.clear();
	 qty.sendKeys("1000");
	 
	 WebElement update_btn = driver.findElement(By.xpath("//span[text()='Update']"));
	 update_btn.click();
	 Thread.sleep(2000);
	 
	 String exp_err="* The maximum quantity allowed for purchase is 500.";
	 WebElement err=driver.findElement(By.xpath("//p[@class='item-msg error']"));
	 String act_err=err.getText();
	 act_err.trim();
	 if(exp_err.equals(act_err))
	 {
		 System.out.println("Error message verified");
		 
	 }
	 else
	 {
		 System.out.println("Error message not verified");
	 }
	 
	 WebElement emptycart = driver.findElement(By.xpath("//span[text()='Empty Cart']"));
	 emptycart.click();

	  WebElement emptycartmsg = driver.findElement(By.xpath("//h1[text()='Shopping Cart is Empty']"));
	  
	  if(emptycartmsg.isDisplayed() )
		  System.out.println("Empty cart is verified");
 
	  else
		  System.out.println("Empty card is not verified");
	  driver.quit();
 } 
	
}
	 
 