package RestassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_Get_request {
	
	@Test
	public void getweatherdetails()
	{
		given()
		.when()
		     .get("http://restapi.demoqa.com/utilities/weather/city/bangalore")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("City",equalTo("Bengaluru"))
		.and()
		.body("WindDirectionDegree",equalTo("220 Degree"))
		.header("content-type","application/json")
		.and()
		.header("content-length",hasSize(166));
		
		

	}
	
	@Test
	public void getreqresdetails()
	{
		given()
		.when()
		     .get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("data.id",equalTo("7"))
		.and()
		.body("last_name",equalTo("Funke"))
		.header("content-type","application/json")
		.and()
		.header("content-length",hasSize(166));
		
		

	}
	

}
