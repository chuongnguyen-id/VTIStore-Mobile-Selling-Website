package com.vti.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;
@Data
public class LoginRequest {

	@NotBlank
	private String username;

@NotBlank
	private String password;

	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

}
