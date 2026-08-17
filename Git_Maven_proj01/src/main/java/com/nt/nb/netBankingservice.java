package com.nt.nb;

public class netBankingservice {
	
	public String doPayment(long srcAcno , long destAcco, double amount) {
		System.out.println("netBankingservice.doPayment()");
		return amount+" amount transferred from " +srcAcno +"to "+destAcco;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
