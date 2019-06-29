package com.FirstRestScript;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;




public class MyFirstCucuSD {

	 Response res;
	@Given("^user hit the get request$")
	public  void user_hit_the_get_request()
	{
		res = RestAssured.given().get("https://www.google.com/");

		// res = RestAssured.given().get("https://www.google.com/");

	}

	@Then("^user checks the \"([^\"]*)\" status code$")
	public  void user_checks_the_status_code(String statCode)
	{
		int statusCode = res.getStatusCode(); // what is StatusCode
		System.out.println("Status code= "+statCode);
		Assert.assertEquals(statCode, Integer.toString(statusCode));

	
	
	}
@Then("^user checks the status code$")
public  void user_checks_the_status_code()
{
	int statCode = res.getStatusCode(); // what is StatusCode
	System.out.println("Status code= "+statCode);
	Assert.assertEquals(statCode, 200);

	

}
}


