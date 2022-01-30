import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		Thread.sleep(6000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		Assert.assertFalse(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("[type='checkbox']")).size(), 6);
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());

		// Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000L);

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("3");
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
//		s.selectByIndex(3);
//		s.selectByVisibleText("4");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		//

	}

}
