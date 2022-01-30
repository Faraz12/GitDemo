import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		ChromeOptions chromeoptions = new ChromeOptions();
		// for japanese language
		chromeoptions.addArguments("-lang= ja");
		WebDriver driver= new ChromeDriver(chromeoptions);
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("a._sv4[title='English (US)']")).click();
		driver.navigate().refresh();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("fqe@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("wwwe0");
		driver.findElement(By.id("u_0_b")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//System.out.println(driver.findElement(By.xpath("//div[@id='globalContainer']/div[3]//div[@role='alert']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[id='globalContainer'] .uiContextualLayer.uiContextualLayerRight ._4rbf._53ij")).getText());
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(By.partialLinkText("هل نسيت الحساب؟")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://yahoo.com");
		driver.navigate().back();
		
		driver.quit();
		

	}

}
