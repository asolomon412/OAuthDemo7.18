package com.oauthdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubToken {

	@JsonProperty("access_token")
	private String accessToken;

	public GithubToken() {
		// TODO Auto-generated constructor stub
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public String toString() {
		return "GithubToken [accessToken=" + accessToken + "]";
	}
	
	
}
