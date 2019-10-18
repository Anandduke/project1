package seleniumday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cls.click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("football shoes");
		WebElement submit = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		submit.click();
		String ptwindow = driver.getWindowHandle();
		System.out.println(ptwindow);
		Set<String> allwindows = driver.getWindowHandles();
		List<String> li = new ArrayList();
		li.addAll(allwindows);
		String windows = li.get(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pgdown = driver.findElement(By.xpath("//span[text()='Did you find what you were looking for?']"));
		js.executeScript("arguments[0].scrollintoview(true)", down);
		
		
		
	}

}
