package example.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:7878/example-selenium-webapp/Index.html");
		System.out.println(driver.getTitle());
		try { Thread.sleep(5000); } catch(Exception e) { }
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("link1")).click();
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("uname")).sendKeys("shubham");
		driver.findElement(By.id("pwd")).sendKeys("2497");
		try { Thread.sleep(5000); } catch(Exception e) { }
		
		driver.findElement(By.id("btn")).click();
		
		try { Thread.sleep(10000); } catch(Exception e) { }
		driver.close();
	}

}
