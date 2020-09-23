package com;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@SpringBootTest
class BankTransactionTest {

	BankTransaction bankTransaction = new BankTransaction();
	@Test
	void testGreetings() {
		
		assertEquals("Welcome",bankTransaction.greetings());
	}

	@Test
	void testGreetingsretunsunexpectedvalue() {
		
		assertNotEquals("Good Morning",bankTransaction.greetings());
	}

	
	@Test
	void testDeposit() {
		assertEquals(1000, bankTransaction.deposit(1000));
		
	}

	@Test
	void testDeposireturnswrongvalue() {
		assertNotEquals(2000, bankTransaction.deposit(1000));
		
	}
	
}
