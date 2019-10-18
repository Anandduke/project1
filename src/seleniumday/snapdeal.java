package seleniumday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

public class snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement searchtxt = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		searchtxt.sendKeys("football shoe");
		WebElement sbtn = driver.findElement(By.xpath("//span[text()='Search']"));
		sbtn.click();
		WebElement shoe = driver.findElement(By.xpath("//p[text()='Adidas PREDATOR  FLEXIBLE Black Football Shoes']"));
		shoe.click();
		String ptwindow = driver.getWindowHandle();
		System.out.println(ptwindow);
		Set<String> allwindow = driver.getWindowHandles();
		List<String> li = new  ArrayList();
		li.addAll(allwindow);
		String childwin = li.get(1);
		System.out.println(childwin);
		driver.switchTo().window(childwin);
		WebElement size = driver.findElement(By.xpath("//div[text()='8']"));
		size.click();
		Thread.sleep(5000);
		WebElement tc = driver.findElement(By.xpath("(//a[contains(text(),'T&C')])[1]"));
		tc.click();
		Set<String> window3 = driver.getWindowHandles();
		List<String> si =new ArrayList();
		si.addAll(window3);
		String tc3 = si.get(2);
		System.out.println(tc3);
		driver.switchTo().window(tc3);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
		email.sendKeys("sanjay loves heli");
		
	}
	

}
