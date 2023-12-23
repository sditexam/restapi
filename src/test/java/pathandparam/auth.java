package pathandparam;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class auth {
	//@Test(priority=1)
	public void authauthentication() {
		
		
	given().
	       auth().preemptive().basic("postman", "password").
	when().
	        get("https://postman-echo.com/basic-auth").
	then().
	         statusCode(200);
		     
		
	}
	//@Test
	public void barriertokenauth() {
		String bearertoken="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";
		
	given()
	      .header("Authorization", "bearer"+bearertoken).
	       
	when().
	        get("https://github.com/sditexam/reatAssuredTest").
	then().
	         statusCode(200).log().all();
		     
		
	}
	//@Test
	public void oauth() {
		
		// auth1 authentication
		given()
		      .auth().oauth("consumerKey", "consumerSecret", "accessToken", "tokenSecret")
		
		.when().
		then();
	}
	//@Test
public void oauth2() {
		
		// auth2 authentication
		given()
		      .auth().oauth2("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")
		
		.when().
		get("https://github.com/sditexam/reatAssuredTest").
		then().statusCode(200).log().all();
	}
	

@Test
public void TestapiKey() {
		
		// auth2 authentication
		given()
		      .auth().oauth2("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")
		
		.when().
		get("https://github.com/sditexam/reatAssuredTest").
		then().statusCode(200).log().all();
	}
	
}
