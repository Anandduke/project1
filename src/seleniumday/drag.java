package seleniumday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement five = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement desti = driver.findElement(By.id("amt7"));
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement destin = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement fived = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destina = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(bank, dest).perform();
		a.dragAndDrop(five, desti).perform();
		a.dragAndDrop(sales, destin).perform();
		a.dragAndDrop(fived, destina).perform();
	}

}
