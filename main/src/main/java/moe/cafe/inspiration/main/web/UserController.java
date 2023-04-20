package moe.cafe.inspiration.main.web;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import moe.cafe.inspiration.main.model.User;
import moe.cafe.inspiration.main.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public @ResponseBody List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/usertest")
	public @ResponseBody User userTest() {
		User u = new User(UUID.randomUUID(), "testuser", "a@b.com", "password", "salt");

		return userService.addUser(u);
	}

}