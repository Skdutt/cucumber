package defination1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepdefination1 {

	WebDriver driver;
	public static String URL = "https://demoapp.skillrary.com/login.php?type=login";
	
	@Given("i should open the browser and navigate to the login page of skillrary")
	public void i_should_open_the_browser_and_navigate_to_the_login_page_of_skillrary() {
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(URL);
	}
	//|user|pw|name|
	
	@When("enter the username {string}")
	public void enter_the_username(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
		System.out.println(user);
	}
	@When("enter the password {string}")
	public void enter_the_password(String pw) {
		driver.findElement(By.id("password")).sendKeys(pw);
		System.out.println(pw);
	}
	@When("click login btn")
	public void click_login_btn() {
		driver.findElement(By.id("last")).click();
	}
	@Then("i should see navigate to the page {string}")
	public void i_should_see_navigate_to_the_page(String string) {
		String register = driver.findElement(By.xpath("//h3[contains(text(),'Register')]")).getText();
		Assert.assertEquals(register, string);
		System.out.println(string);
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
		String str1=  driver.getCurrentUrl();
		if(str1.equalsIgnoreCase("https://demoapp.skillrary.com/cart_view.php"))
		{
		String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		Assert.assertEquals(username, name);
		}
		
		else
		
		{
			String admin = driver.findElement(By.xpath("//*[@class='pull-left info']/p")).getText();
			Assert.assertEquals(admin, name);
		}
		
		driver.close();
	}
}