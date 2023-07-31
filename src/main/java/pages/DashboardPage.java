package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Bank & Cash']")
	WebElement Bank_Cash;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='New Account']")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement BankingURL;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Submit']")
	WebElement ClickSubmit;

	public void clickBankCash() {
		Bank_Cash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickNewAccount() {
		NewAccount.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void insertAccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
	}

	public void insertDescription(String description) {
		Description.sendKeys(description);
	}

	public void insertInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
	}

	public void insertAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
	}

	public void insertContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}

	public void insertPhone(String phoneNumber) {
		Phone.sendKeys(phoneNumber);
	}

	public void insertBankingURL(String internetBankingURL) {
		BankingURL.sendKeys(internetBankingURL);
	}

	public void ClickSubmit() {
		ClickSubmit.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	
}
