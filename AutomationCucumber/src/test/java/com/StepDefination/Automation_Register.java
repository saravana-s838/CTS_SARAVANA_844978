package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.TestRunner.Register_Runner;
import com.pages.Automation_Registerpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Register{
	
	 Automation_Registerpage a=new Automation_Registerpage();
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    a.url();
	}

	@When("^the user open the  Automation demo Home page$")
	public void the_user_open_the_Automation_demo_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    a.RegisterPage();
	}

	@Then("^the user register using username and password$")
	public void the_user_register_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    a.RegisterDeatils();
	}

	@Then("^click on the register button user nagivate to the next page$")
	public void click_on_the_register_button_user_nagivate_to_the_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    a.submit();
	}


}
