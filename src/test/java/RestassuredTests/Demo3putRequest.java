package RestassuredTests;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Demo3putRequest {
	
	
	public static Map<String,String> map= new HashMap<String,String>();
	String name = Restutils.getFirstname();
	String salary =Restutils.getSalary();
	String age = Restutils.getAge();
	int id = 5;
@BeforeClass
public void putdata()
{
	map.put("name", name);
	map.put("salary", salary);
	map.put("age", age);
//	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees"; gives the list of employees by using get method of Http
//	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee/4"; gives the employee details where emp id is 4 by using get method of http
//	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/update/4"; it updates the employees details	where emp id is 4 by using put method of http
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/update/"+id;
}

@Test
public void testPut()
{
	given()
	    .contentType("application/json")
	    .body(map)
	.when()
	    .put()
	.then()
	    .statusCode(200)
		.log().all();// it gives the all the details of response 
}


}
