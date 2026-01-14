package com.example.demo.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponse {

	private String token;

	public AuthResponse(String token) {
		this.token=token;
	}
	public String getToken() {
		return token;
	}

}
