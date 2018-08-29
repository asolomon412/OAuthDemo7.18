package com.oauthdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	// this is to hide the values in my application.properties file
	@Value("${github.clientid}")
	private String cId;
	@Value("${github.clientsecret}")
	private String cSecret;

	@RequestMapping("/")
	public ModelAndView index() {
		// going to pass the clientid to the page as params for my link to
		// hide them from github :)

		return new ModelAndView("index","id", cId);
	}

	@RequestMapping("/result")
	public ModelAndView result(@RequestParam("code") String code) {
		System.out.println(code);
		// Adding headers to our API request
		HttpHeaders headers = new HttpHeaders();

		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		// to attach the headers to our request we need the HttpEntity
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		// ResponseEntity will help us get the data from the API
		// using the @Value Strings that I assigned above to hide my details from github
		ResponseEntity<GithubToken> response = restTemplate.exchange(
				"https://github.com/login/oauth/access_token?client_id=" + cId + "&client_secret=" + cSecret
						+ "&redirect_uri=http://localhost:8080/result&state=hakhhfuahuhwauhfahjahfa&code=" + code,
				HttpMethod.POST, entity, GithubToken.class);

		System.out.println(response.getBody());

		return new ModelAndView("result", "test", response.getBody());
	}
}
