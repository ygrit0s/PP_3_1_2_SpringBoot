package habsida.ygrit0s.springboot.service;

import habsida.ygrit0s.springboot.entity.User;

import java.util.List;

public interface UserService {
	
	List<User> userList();
	
	User getUser(Long id);
	void addUser(User user);
	
	void updateUser(User user);
	
	void removeUser(Long id);
}
