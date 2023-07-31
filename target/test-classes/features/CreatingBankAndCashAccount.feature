@Regression
Feature: Techfios billing login page functionality vallidation

  Background: 
    Given User is on the techfios login page

  @Sanity
  Scenario: User should be able to login with valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page
    And User clicks on bankCash
    And User clicks on newAccount
    And User enters accountTitle as "Chandra's Saving"
    And User enters description as "Long term emergency fund"
    And User enters initialBalance "1000000"
    And User enters accountNumber as "54123789"
    And User enters contactPerson to "Chandra"
    And User enters phoneNumber as ""
    And User enters internetBankingURL as "https://chandrax.com"
    And User clicks on submit
    Then User should land on accounts page
