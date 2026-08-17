package com.nt.nb;

public class netBankingservice {
	
	public String doPayment(long srcAcno , long destAcco, double amount) {
		System.out.println("netBankingservice.doPayment()");
		System.out.println("adding new line to syso");
		if(srcAcno <0 || destAcco < 0 || amount < 0)
			throw new IllegalArgumentException("Invalid Input");
		return amount+" amount transferred from " +srcAcno +"to "+destAcco;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
