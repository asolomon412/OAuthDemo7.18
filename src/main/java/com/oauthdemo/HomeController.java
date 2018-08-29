package com.oauthdemo;

import org.springframework.beans.factory.annotation.Value;
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
		System.out.println(code); // testing that the code is coming through
			
		RestTemplate restTemplate2 = new RestTemplate();
		GithubToken token = restTemplate2.getForObject("https://github.com/login/oauth/access_token?client_id=" + cId + "&client_secret=" + cSecret
				+ "&redirect_uri=http://localhost:8080/result&state=hakhhfuahuhwauhfahjahfa&code=" + code, GithubToken.class);
		
		System.out.println(token.getAccessToken()); // testing for the access token being returned
		

		return new ModelAndView("result", "test", token.getAccessToken()) ;
	}
	
		
	
}
