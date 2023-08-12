package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;

public class StepsDefination extends BasePage {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void setup() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String field) {
		switch (field) {
		case "username":
			loginPage.enterUserName(loginData);
			break;
		case "password":
			loginPage.enterPassword(loginData);
			break;
		default:
			System.out.println("Data unable to located!");

		}

	}

	@When("User clicks on {string}")
	public void user_clicks_on(String click) {
		loginPage.clickSignInButton();

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTtle = "Dashboard- iBilling";
		String actualTitle = dashboardPage.getPageTitleDb();
		Assert.assertEquals(expectedTtle, actualTitle);
		System.out.println(actualTitle +"***");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Then("User clickss on {string}")
	public void user_clickss_on(String string) {
		switch (string) {
		case "bankCash":
			dashboardPage.clickBankCash();
			break;
		case "newAccount":
			dashboardPage.clickNewAccount();
			break;
		default:
			System.out.println("Data unable to located!");
			
		}

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountInfo, String acField) {
		switch (acField) {
		case "accountTitle":
			dashboardPage.insertAccountTitle(accountInfo + accountNumber(999));
			break;
		case "description":
			dashboardPage.insertDescription(accountInfo);
			break;
		case "initialBalance" :
			dashboardPage.insertInitialBalance(accountInfo);
			break;
		case "accountNumber" :
			dashboardPage.insertAccountNumber(accountInfo + accountNumber(999));
			break;
		case "contactPerson" :
			dashboardPage.insertContactPerson(accountInfo);
			break;
		case "Phone" :
			dashboardPage.insertPhone(accountInfo + randomPhone(9999));
			break;
		case "internetBankingURL" :
			dashboardPage.insertBankingURL(accountInfo);
			break;
		default:
			System.out.println("Data unable to located!");

		}

	}

	@Then("User clicksss on {string}")
	public void user_clicksss_on(String click) {
		dashboardPage.ClickSubmit();

	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String expectedTtle = "Accounts- iBilling";
		String actualTitle = dashboardPage.getPageTitle();
		Assert.assertEquals(expectedTtle, actualTitle);
		System.out.println(actualTitle +"***");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@After
	public void tearDown() {
	driver.close();

	}

}