package testcases;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SampleGetRequestTest {
	
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users/";
	}
	
	
	@Title(value = "To check the get request")
	@Test
	public void getUserTest() {
		
		Response httpResponse = SerenityRest.given().when().get("2");
		httpResponse.prettyPrint();
		
	}
}
