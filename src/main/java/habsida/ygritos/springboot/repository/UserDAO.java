package habsida.ygritos.springboot.repository;

import habsida.ygritos.springboot.entity.User;

import java.util.List;

public interface UserDAO {
	
	List<User> userList();
	
	User getUser(Long id);
	void addUser(User user);
	
	void updateUser(User user);
	
	void removeUser(Long id);
}