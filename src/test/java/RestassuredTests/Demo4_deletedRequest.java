package RestassuredTests;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo4_deletedRequest {
	
	int id = 5;


@Test
public void deletedata()
{
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/delete/1";
	Response response=
	
	given()
	.when()
	      .delete()
	 .then()
	      .statusCode(200)
	      .statusLine("HTTP/1.1 200 OK")
	      .body("status",equalTo("success"))
	      .log().all()
	      .extract().response();
	String JsonString = response.asString();
	Assert.assertEquals(JsonString.contains("successfully! deleted Records"), true);
}


}
