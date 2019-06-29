package com.basic.getRequestSd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//we moved FF from java to resource folder
//so give path in runner file
@CucumberOptions(
		features={"src/test/resources/com/basic/getRequestFF/"},// feature file cha path
		glue={"com/basic/getRequestSd/"} // stepdefinition file cha path .. 
		
		)


public class MyGetRequestRunnerTest {

}
