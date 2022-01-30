import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.ae/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("3");
		System.out.println(driver.findElement(By.id("Adults")).getText());
		//Assert.assertEquals(driver.findElement(By.id("Adults")).getText(), "2");
		Select ch = new Select(driver.findElement(By.id("Childrens")));
		ch.selectByValue("2");
		//System.out.println(driver.findElement(By.id("Childrens")).getText());
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		Assert.assertEquals(driver.findElement(By.id("homeErrorMessage")).getText(), "Sorry, but we can't continue until you fix everything that's marked in RED");

	}

}
