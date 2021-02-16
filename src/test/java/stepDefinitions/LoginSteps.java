package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl);
	   
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
	    System.out.println("inside step -user enters user name and password ");
	}

	@And("clicks on login feature")
	public void clicks_on_login_feature() {
	    System.out.println("inside step - clicks_on_login_feature");
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("inside step  -user is navigated to the home page ");
	}

}
