package com.vti.entity.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
	private String username;
	private String phone;
	private String adress;
	private String email;
	private String password;
	private String avatar;
	private double walletCast;
}
