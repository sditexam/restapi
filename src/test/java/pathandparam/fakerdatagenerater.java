package pathandparam;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class fakerdatagenerater {
	
	@Test
	
	public void dummydata() {
		
		
		Faker faker=new Faker();
		String fullname=faker.name().fullName();
		String firstname=faker.name().firstName();
		String lastname=faker.name().lastName();
		String username=faker.name().username();
		String password=faker.internet().password();
		String phoneno=faker.phoneNumber().phoneNumber();
		String email=faker.internet().safeEmailAddress();
		
		
		System.out.println(">>>>>full name is >>>>>"+fullname+"   >>>>>>>email id is >>>>>>>> "+ email );
		System.out.println(">>>>>user name is >>>>>> "+username +"  >>>>>> password  is>>>>>> "+ password );
	
	}
}
