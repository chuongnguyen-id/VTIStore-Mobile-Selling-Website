package com.vti.entity.Form;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CartForm {
	private double amount;
	private boolean isPaid;
	private String comment;
	private int[] productId;
	private int userId;
	public CartForm(double amount, Boolean isPaid, String comment, int[] productId, int userId) {
		super();
		this.amount = amount;
		this.isPaid = isPaid;
		this.comment = comment;
		this.productId = productId;
		this.userId = userId;
	}
	
	
	
	
}
