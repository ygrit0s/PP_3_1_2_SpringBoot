package habsida.ygritos.springboot.service;

import habsida.ygritos.springboot.entity.User;

import java.util.List;

public interface UserService {
	
	List<User> userList();
	
	User getUser(Long id);
	void addUser(User user);
	
	void updateUser(User user);
	
	void removeUser(Long id);
}
