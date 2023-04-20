package moe.cafe.inspiration.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import moe.cafe.inspiration.main.model.User;
import moe.cafe.inspiration.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
}