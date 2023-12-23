package pathandparam;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class cookieTest {
	
	
	@Test
	public void cookieTest() {
		
		Response res=given()
		 
		.when()
		    .get("https://www.google.com/");
		
		Map<String,String> cookies_list= res.getCookies();
		
		System.out.println(	cookies_list.keySet());
		
		for (String k : cookies_list.keySet())
		{
			String cv=res.cookie(k);
			
			System.out.println(cv);
			
		}
	
		
		
	}

}
