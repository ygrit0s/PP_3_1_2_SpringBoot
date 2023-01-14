package habsida.ygrit0s.springboot.service;

import habsida.ygrit0s.springboot.entity.User;
import habsida.ygrit0s.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> userList() {
		return userRepository.findAll();
	}
	
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public void removeUser(Long id) {
		userRepository.delete(getUser(id));
	}
}
