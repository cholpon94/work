package com.StepDefinitions;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import com.Utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class APIStepDefs {
	
	@Given("I logged Bookit api using {string} and {string}")
	public void i_logged_Bookit_api_using_and(String username, String password) {
		
		String tokenurl = ConfigurationReader.getProperty("qa1_tokenurl");
		
		Map<String,String> loginparams = new HashMap<>();
	    loginparams.put("email",username);
	    loginparams.put("password", password);
	    
	    Response response = given().accept(ContentType.JSON).and().params(loginparams)
	            .when().get(tokenurl);
	    
	    JsonPath json = response.jsonPath();
	    
	    String accessToken  = json.getString("accessToken");
	    
	    

	}

	@When("I get the current user information from api")
	public void i_get_the_current_user_information_from_api() {
		
		//String url = ConfigurationReader.getProperty("qa1_baseurl")
		
		
		

	}

	@Then("the information about current user should be returned")
	public void the_information_about_current_user_should_be_returned() {

	}

}
