package seleniumday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        WebElement hambtn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
        hambtn.click();
        WebElement btnmob = driver.findElement(By.xpath("//a[@data-menu-id='7']"));
        btnmob.click();
}
	
}