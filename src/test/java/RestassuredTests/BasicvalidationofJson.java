package RestassuredTests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class BasicvalidationofJson {

	
	//1.test status code
	//2.log response
	//3. verifying single content in response body
	//4. verifying multiple content in response body
	//5.setting parameters and headers
	
	@Test(priority=1,description="test status code")
	public void validation1()
	{
		given()
		.when().get("http://jsonplaceholder.typicode.com/posts/5")
		.then().statusCode(200)
		.log().all();//provides all the reponse code such as body and header
		
	}
	
	@Test(priority=2,description="log resonse")
	public void validation2()
	{
		given()
		.when().get("http://jsonplaceholder.typicode.com/posts/5")
		.then().statusCode(200)
		.log().all();//provides all the reponse code such as body and header
		
	}
	
}
