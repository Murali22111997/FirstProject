package com.stepdefinition;

import org.openqa.selenium.By;

import com.runner.Runnerclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepfile extends Runnerclass {


@Given("User launches the Application using the URL")
public void user_launches_the_application_using_the_url() throws Throwable {
    
	geturl("https://www.facebook.com/");
	maximise();
	Thread.sleep(3000);
	
    throw new io.cucumber.java.PendingException();
}
@When("User enters the username in the Username Field")
public void user_enters_the_username_in_the_username_field() {
   
	driver.findElement(By.id("email")).sendKeys("Murali@gmail.com");
	
    throw new io.cucumber.java.PendingException();
}
@When("User enters the password in the Password Field")
public void user_enters_the_password_in_the_password_field() {
    driver.findElement(By.id("pass")).sendKeys("Murali");
    
    throw new io.cucumber.java.PendingException();
}
@Then("User Clicks the Login button then it navigates facebook homepage")
public void user_clicks_the_login_button_then_it_navigates_facebook_homepage() {
    
    
    throw new io.cucumber.java.PendingException();
}
@Then("User Clicks the login button its navigates to Register page")
public void user_clicks_the_login_button_its_navigates_to_register_page() {
	driver.findElement(By.xpath("//*[@id=\"u_0_5_nF\"]")).click();
    throw new io.cucumber.java.PendingException();
}



}
