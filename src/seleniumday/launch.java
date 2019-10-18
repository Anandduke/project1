package seleniumday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class launch {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse WS\\seleniumday\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://onecognizant.cognizant.com/");
            driver.manage().window().maximize();
			WebElement d = driver.findElement(By.id("userNameInput"));
			d.sendKeys("721908");
			WebElement pass = driver.findElement(By.id("passwordInput"));
			pass.sendKeys("Dina@250");
			WebElement logon = driver.findElement(By.xpath("//input[@value='LOG ON']"));
			logon.click();
			Thread.sleep(8000);
			WebElement btn = driver.findElement(By.xpath("//input[@type='button']"));
			btn.click();
			Thread.sleep(10000);
			WebElement search = driver.findElement(By.id("txtPlatformBarSearch"));
			search.sendKeys("one transport");
			WebElement searchBtn = driver.findElement(By.xpath("//input[@type='button']"));
			searchBtn.click();
			Thread.sleep(8000);
			//Set<String> allwindows = driver.getWindowHandles();
			//List<String> li= new ArrayList<String>();
			//li.addAll(allwindows);
			//System.out.println(li);
			//String onetab = li.get(0);
			//driver.switchTo().window(onetab);
			WebElement fram = driver.findElement(By.xpath("//iframe[@id='appFrame']"));
			driver.switchTo().frame(fram);
			Thread.sleep(5000);
			WebElement btnone = driver.findElement(By.xpath("//img[@src='https://onecognizantcdn.cognizant.com/OneCCore/AppIcons/988_small.png']"));
			Actions a =new Actions(driver);
			a.moveToElement(btnone).perform();
			Thread.sleep(5000);
			WebElement onet = driver.findElement(By.xpath("//p[contains (text(),'workplace transportation')]"));
			onet.click();
			Thread.sleep(10000);
			WebElement fram2 = driver.findElement(By.xpath("//iframe[@id='appFrame']"));
			driver.switchTo().frame(fram2);
			WebElement tripdetails = driver.findElement(By.xpath("//a[@class='CityAdmin']"));
			tripdetails.click();
			WebElement trips = driver.findElement(By.xpath("//span[text()='Trips']"));
			trips.click();
			WebElement edit = driver.findElement(By.xpath("(//a[text()='Edit'])[2]"));
			edit.click();
			
		}
	

}
