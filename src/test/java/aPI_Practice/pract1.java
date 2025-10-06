package aPI_Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class pract1 {

	@Test
	public void test001()
	{
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.statusCode());
		System.out.println(res.asPrettyString());
	}
}
