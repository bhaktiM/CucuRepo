package com.FirstRestScript;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)

//we moved FF from java to resource folder
//so give path in runner file
@CucumberOptions(
		features={"src/test/resources/com/basic/FirstRestScript/"},// feature file cha path
		glue={"com/FirstStepScript/MyFirstCucuSD/"} // stepdefinition file cha path .. 
		
		)
public class MyFirstCucuRunnerTest {

	
}
