package com.library.librarymanager;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

	@Test
	public void testIdIsAutomaticallyAssignedAsPositiveNumber() {
		User user = new User();
		assertTrue("Id should be positive", user.getId() > 0);
	}

	@Test
	public void testIdsAreIncremental() {
		User firstUser = new User();
		User secondUser = new User();
		assertTrue("Ids should be incremental", firstUser.getId() < secondUser.getId());
	}

	@Test
	public void testDepositWhenAmountIsCorrectShouldIncreaseBalance() {
		User user = new User();
		user.deposit(15);
		assertEquals(15, user.getBalance(), 0);
	}

	@Test
	public void testDepositWhenAmountIsNegativeShouldThrowWithAssertThrows() {
		User user = new User();
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> user.deposit(-5));
		assertEquals("Negative amount: -5.0", e.getMessage());
		assertEquals(0, user.getBalance(), 0);
	}
}
