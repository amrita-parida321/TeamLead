package com.nt.upi;

public class upipayment {
	public String dopayment(long phone , double amount)
	{
		System.out.println("UPI payment : doPayment()");
		if(phone <0 || amount<0)
			throw new IllegalArgumentException("invalid input");
		return amount+ "Amount is transferred to " + phone ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
