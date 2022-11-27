package com.vti.payload.request;

import java.util.Set;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class SignupRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String email;
	
	@NotBlank
	private String password;
	
//	private String phone;
//	
//	private String adress;

	public SignupRequest(@NotBlank String username, @NotBlank String email, @NotBlank String password
			) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		
	}

	private Set<String> role;
	
	
	

}
