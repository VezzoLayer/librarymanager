package com.library.librarymanager;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

	@Test
	public void testIdIsAutomaticallyAssignedAsPositiveNumber() {
		User user = new User();
		assertTrue("Id should be positive", user.getId() > 0);
	}
}
