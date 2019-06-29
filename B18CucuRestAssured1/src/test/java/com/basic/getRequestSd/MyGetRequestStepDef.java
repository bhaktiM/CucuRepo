package com.basic.getRequestSd;

import org.junit.Assert;

//import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGetRequestStepDef {

	Response resp;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Start");
	    throw new PendingException();
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
resp = RestAssured.given().relaxedHTTPSValidation().when().get("https://ergast.com/api/f1/2017/circuits.json");
		
//print response in string
String respString = resp.asString();
System.out.println(respString);
		
//get all headers 
//header heds = resp.getHeaders();
//System.out.println(heds);


		throw new PendingException();
	}

	@Then("^user checks the status code$")
	public void user_check_the_status_code() throws Throwable {
	    //Get Status code from the response 
		//int ExpCode = Integer.parseInt(expStatusCode);
		int statusCode = resp.getStatusCode();
		//Assert.assertTrue(expStatusCode==statusCode);
		
		
	    throw new PendingException();
	}

	
	@Then("^user check the limit$")
	public void user_check_the_limit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user check the count or size$")
	public void user_check_the_count_or_size() throws Throwable {

		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
				Assert.assertEquals("30",limitValue);

			//	resp.then().assertThat().body("MRData.CircuitTable.Circuit.circuitId",hasSize(20));
		
		throw new PendingException();
	}

//	@Then("^user checks at path \"([^\"]*)\"$")
	//public void user_checks_at_path(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	//}


}
