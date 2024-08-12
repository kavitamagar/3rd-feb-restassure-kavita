package BacicHTTPRequests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class getRequest_invalidid 
{
	@Test
	public void getRequest_inValidId()
	{
		given()
		.contentType("application/json")
		.when()
		  .get("https://reqres.in/api/users/23")
		  .then()
            .statusCode(404)		
		.log().all();
		
		
		   
		    
	}

}
