package seleniumScripts;



import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class handelPopWindow {
 

 
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://live.guru99.com/");
	 WebElement mob = driver.findElement(By.xpath("//a[text()='Mobile']"));
	 mob.click();
	 Thread.sleep(3000);
	 
	 WebElement addtocompare1 = driver.findElement(By.xpath("(//a[text()='Add to Compare'])[3]"));
	 addtocompare1.click();
	 Thread.sleep(3000);
	WebElement addtocompare2 = driver.findElement(By.xpath("(//a[text()='Add to Compare'])[2]"));
	addtocompare2.click();
	Thread.sleep(3000);
	
	WebElement compareclick = driver.findElement(By.xpath("//span[text()='Compare']"));
	compareclick.click();
	
	Set<String> s = driver.getWindowHandles();
	Iterator<String> it=s.iterator();
	it.next();
	String w2=it.next();
	driver.switchTo().window(w2);
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement sonyx = driver.findElement(By.xpath("//a[text()='Sony Xperia']"));
	WebElement iphone = driver.findElement(By.xpath("//a[text()='IPhone']"));
	
	if(sonyx.isDisplayed()&& iphone.isDisplayed())
		System.out.println("Compare page is verified");
	else {
		System.out.println("Compare page is not verified");
		
	}
	driver.quit();
	
 }
}