	#gherkin language
Feature: test the skillrary app
  1) valid case
  2)invalid case
 Background:
 		Given i should open the browser and navigate to the login page of skillrary
 @hello
  Scenario Outline: to test the login with valid credentials
    #Given i should open the browser and navigate to the login page of skillrary
    When enter the username "<user>"
    And enter the password "<pw>"
    And click login btn
    Then i should see the username as "<name>"
 Examples:
|user|pw|name|
|user|user|Harry Den|
|user|user|Harry Den|
@NegativeTesting #for singe Scenario
 Scenario: to test the login with valid credentials
    #Given i should open the browser and navigate to the login page of skillrary
    When enter the username "shreya"
    And enter the password "shreya"
    And click login btn
    Then i should see navigate to the page "Register"