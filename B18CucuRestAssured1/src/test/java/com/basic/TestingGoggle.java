package com.basic;

import org.junit.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoggle {

	public static void main(String[] args) {

		
		Response res = RestAssured.given().get("https://www.google.com/");
		int statCode = res.statusCode(); // what is StatusCode
		System.out.println("Status code= "+statCode);
	
	
	}
	
	
//	@Test 
	public void testGoggle(){
			
				Response res = RestAssured.given().get("https://www.google.com/");
		int statCode = res.statusCode(); // what is StatusCode
		System.out.println("Status code= "+statCode);
		
		Assert.assertEquals(statCode, 200);
			
	}

}
