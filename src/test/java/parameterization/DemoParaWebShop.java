package parameterization;

import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoParaWebShop
{
	WebDriver driver;
	
	@Given("App is launched by user xx")
	public void app_is_launched_by_user_xx() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("user clicks on the Register on home page xx")
	public void user_clicks_on_the_Register_on_home_page_xx() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("user enters valid data in input fields xx")
	public void user_enters_valid_data_in_input_fields_xx() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Sanchita");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Godse");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sanch123");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("sanch123");
	}

	@Then("user clicks on register xx")
	public void user_clicks_on_register_xx() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.close();
	}

	@Given("User clicks on the Login link on the homepage xx")
	public void user_clicks_on_the_Login_link_on_the_homepage_xx() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
	}

	@When("User enters the registered valid username {string} xx")
	public void user_enters_the_registered_valid_username_xx(String string_uname) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string_uname);
	}

	@When("Valid Password in respective field {string} xx")
	public void valid_Password_in_respective_field_xx(String string_pswrd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string_pswrd);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
	}


}

/*
 * import cucumber.api.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

	WebDriver driver;
	
 *  System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 
		 	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
 */
