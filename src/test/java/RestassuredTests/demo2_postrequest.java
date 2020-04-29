package RestassuredTests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class demo2_postrequest {

	public static Map<String,String> map = new HashMap<String,String>();
	
	
	@BeforeClass
	public void postdata()
	{
		map.put("FirstName",Restutils.getFirstname());
		map.put("LastName",Restutils.getLastname());
		map.put("UserName",Restutils.getUsername());
		map.put("Password",Restutils.getPassword());
		map.put("Email",Restutils.getEmail());
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	}
	
	@Test
	public void testpost()
	{ 

		
		given()
			.header("contentType","application/json")
		    .contentType(ContentType.JSON).accept(ContentType.JSON)
		    .body(map)
		.when()
		   .post()
		 .then()
		    .statusCode(201)
		    .and()
		    .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		    .and()
		    .body("Message",equalTo("Operation completed successfully"));
	}
	
}
