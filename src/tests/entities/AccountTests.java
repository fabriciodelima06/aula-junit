package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	@Test
	public void depositShoudIncreseBalanceWhenPositiveAmount() {
		
		double amount = 200.0;
		double expetedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expetedValue, acc.getBalance());
	}
}
