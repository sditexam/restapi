package pathandparam;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class headettest {

	@Test
	public void TestHeader() {

		Response res = given()

				.when().get("https://www.google.com/");

		Headers hd = res.getHeaders();

		for (Header k : hd) {
			System.out.println(k.getName()+"........"+k.getValue());
		}

	}

}
