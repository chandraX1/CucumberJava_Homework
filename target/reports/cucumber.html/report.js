$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreatingBankAndCashAccount.feature");
formatter.feature({
  "name": "Techfios billing login page functionality vallidation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepsDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepsDefination.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_clicks_on_bankCash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_clicks_on_newAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountTitle as \"Chandra\u0027s Saving\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_accountTitle_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters description as \"Long term emergency fund\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialBalance \"1000000\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_initialBalance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountNumber as \"54123789\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_accountNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contactPerson to \"Chandra\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_contactPerson_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phoneNumber as \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_phoneNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetBankingURL as \"https://chandrax.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_enters_internetBankingURL_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepsDefination.user_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on accounts page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepsDefination.user_should_land_on_accounts_page()"
});
formatter.result({
  "status": "passed"
});
});