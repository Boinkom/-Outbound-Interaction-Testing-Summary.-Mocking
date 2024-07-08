package ru.productstar.outcoming;

import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.productstar.outcoming.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Real_HzClientTest {

	@Autowired
	private UserService userService;

	@Test
	public void testIntegrationSaveUser() {
		User user = new User();
		user.setName("Jane");
		user.setEmail("jane@example.com");

		User savedUser = userService.saveUser(user);
		assertThat(savedUser).isNotNull();
		assertThat(savedUser.getId()).isNotNull();
	}
}