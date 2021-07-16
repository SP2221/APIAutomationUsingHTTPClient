package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import com.qa.data.LoanAppResponse;
import com.qa.data.LoanAppInfo;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class PostAPITest extends TestBase{
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closebaleHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		testBase = new TestBase();
		apiUrl = prop.getProperty("URL");
		serviceUrl = prop.getProperty("serviceURL");
		url = apiUrl + serviceUrl ;
		
	}
	
	
	@Test
	public void 	postAPITest() throws JsonGenerationException, JsonMappingException, IOException{
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("x-cf-source-id", "coding-challenge");
		headerMap.put("x-cf-corr-id", "fcb24980-be6c-11eb-8529-0242ac130003");
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		LoanAppInfo requestInfo = new LoanAppInfo("b8096ec7-2150-405f-84f5-ae99864b3e96", true);
				 //expected users object

		//object to json file:
	//	mapper.writeValue(new File("/Users/pandeysx/Automation/APIAutomationUsingHTTPClient/src/main/java/com/qa/data/users.json"), loanAppInfo);

		//java object to json in String:
		String usersJsonString = mapper.writeValueAsString(requestInfo);
		System.out.println(usersJsonString);
		//Calling Body- request string ,URL, header
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API

		//validate response from API:
		//1. status code:
		// Extracting status code from the response object
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_200);

		//2. JsonString, getting response /getEntity return string, readable format of the string
		String responseString = EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("The response from API is:"+ responseJson);

		//Converting json to java object:
		LoanAppResponse loanAppResponse   = mapper.readValue(responseString, LoanAppResponse.class); //actual users object
		System.out.println(loanAppResponse );

		Assert.assertTrue(requestInfo.getLoanAppUuid().equals(loanAppResponse.getLoanAppResumptionInfo().getLoanAppUuid()));

	}

	@Test
	public void postAPITestInvalidRequest() throws JsonGenerationException, JsonMappingException, IOException{
		restClient = new RestClient();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		headerMap.put("x-cf-source-id", "coding-challenge");

//      Passing invalid "x-cf-corr-id" value to generate 404
		headerMap.put("x-cf-corr-id", "fcb24980-be6c-11eb-8529-0242ac130003");
		//jackson API:
		ObjectMapper mapper = new ObjectMapper();
		LoanAppInfo requestInfo = new LoanAppInfo("b8096ec7-2150-405f-84f5-ae99864b3e96", true);

		//Converting Java object to Json in String:
		String usersJsonString = mapper.writeValueAsString(requestInfo);
		System.out.println(usersJsonString);
		//Calling Request string ,URL, header
		url=url+"invalid";
		closebaleHttpResponse = restClient.post(url, usersJsonString, headerMap); //call the API

		//Validate response from API:
		// Extracting status code from the response object and asserting
		int statusCode = closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_404);


	}
}
