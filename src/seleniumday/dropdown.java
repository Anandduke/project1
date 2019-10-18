package seleniumday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btncourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(btncourse).perform();
		WebElement btncloud = driver.findElement(By.xpath("//span[text()='Cloud Computing']"));
		btncloud.click();
}
}