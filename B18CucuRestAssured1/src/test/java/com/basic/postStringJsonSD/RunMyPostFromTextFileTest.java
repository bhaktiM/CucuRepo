package com.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
//		
		//features= {"src/test/resources/com/basic/postStringJsonSD/"},
		
		features= {"src/test/resources/com/basic/postStringJsonFF/"},
		glue={"com/basic/postStringJsonSD/"}
		
		)
		

public class RunMyPostFromTextFileTest {


}
