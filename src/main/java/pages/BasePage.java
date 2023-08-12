package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public int accountTitle(int bound) {
		Random rnd = new Random();
		int accountTitle = rnd.nextInt(99);
		return accountTitle;
	}

	public int accountNumber(int bound) {
		Random rnd = new Random();
		int accountNumber = rnd.nextInt(999);
		return accountNumber;
	}

	public int randomPhone(int bound) {
		Random rnd = new Random();
		long randomPh = 2140000000 + rnd.nextInt(9999);
		return (int) randomPh;
	}

}
