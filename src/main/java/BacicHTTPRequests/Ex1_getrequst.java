package BacicHTTPRequests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Ex1_getrequst 
{
	@Test
	public void getrequest()
	{
		given()
		.contentType("application/json")
		.when()
		  .get("https://reqres.in/api/users/2")
		  .then()
		     .statusCode(200)
		     .body("data.first_name",equalTo("Janet"))
		      .body("data.last_name",equalTo("Weaver"))
		      .body("data.id",equalTo(2))
		      .contentType("application/json")
		      .log().all();
		
	}

}
