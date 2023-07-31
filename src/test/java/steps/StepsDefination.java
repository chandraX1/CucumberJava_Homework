package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;

public class StepsDefination extends BasePage {

	LoginPage loginPage;
	DashboardPage dashboard;

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=login");

	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();

	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTtle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTtle, actualTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Then("User clicks on bankCash")
	public void user_clicks_on_bankCash() {
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.clickBankCash();

	}

	@Then("User clicks on newAccount")
	public void user_clicks_on_newAccount() {
		dashboard.clickNewAccount();

	}

	@Then("User enters accountTitle as {string}")
	public void user_enters_accountTitle_as(String accountTitle) {
		dashboard.insertAccountTitle(accountTitle + accountTitle(999));

	}

	@Then("User enters description as {string}")
	public void user_enters_description_as(String description) {
		dashboard.insertDescription(description);

	}

	@Then("User enters initialBalance {string}")
	public void user_enters_initialBalance(String initialBalance) {
		dashboard.insertInitialBalance(initialBalance);

	}

	@Then("User enters accountNumber as {string}")
	public void user_enters_accountNumber_as(String accountNumber) {
		dashboard.insertAccountNumber(accountNumber(9999) + accountNumber);

	}

	@Then("User enters contactPerson to {string}")
	public void user_enters_contactPerson_to(String contactPerson) {
		dashboard.insertContactPerson(contactPerson);

	}

	@Then("User enters phoneNumber as {string}")
	public void user_enters_phoneNumber_as(String phoneNumber) {
		dashboard.insertPhone(phoneNumber + randomPhone(9999));

	}

	@Then("User enters internetBankingURL as {string}")
	public void user_enters_internetBankingURL_as(String internetBankingURL) {
		dashboard.insertBankingURL(internetBankingURL);
	}

	@When("User clicks on submit")
	public void user_clicks_on_submit() {
		dashboard.ClickSubmit();

	}

	@Then("User should be able to validate created account")
	public void user_should_be_able_to_validate_created_account() {

	}
	
	
	@Then("User should land on accounts page")
	public void user_should_land_on_accounts_page() {
		String expectedTtle = "Accounts- iBilling";
		String actualTitle = dashboard.getPageTitle();
		Assert.assertEquals(expectedTtle, actualTitle);
		System.out.println(actualTitle +"***");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
