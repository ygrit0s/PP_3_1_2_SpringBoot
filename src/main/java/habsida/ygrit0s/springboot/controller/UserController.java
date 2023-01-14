package habsida.ygrit0s.springboot.controller;

import habsida.ygrit0s.springboot.entity.User;
import habsida.ygrit0s.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/users")
	public String userList(Model model) {
		model.addAttribute("userList", userService.userList());
		return "list";
	}
	
	@GetMapping("/users/{id}")
	public String getUser(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", userService.getUser(id));
		return "show";
	}
	@GetMapping("/users/new")
	public String addUser(@ModelAttribute("user") User user) {
		return "new";
	}
	
	@PostMapping("/users/new")
	public String add(@ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "new";
		} else {
			userService.addUser(user);
			return "redirect:/users";
		}
	}
	
	@GetMapping("/users/edit/{id}")
	public String updateUser(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", userService.getUser(id));
		return "edit";
	}
	@PatchMapping("/users/edit")
	public String update(@ModelAttribute("user") User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "edit";
		} else {
			userService.updateUser(user);
			return "redirect:/users";
		}
	}

	@DeleteMapping("/users/delete/{id}")
	public String removeUser(@PathVariable("id") Long id) {
		userService.removeUser(id);
		return "redirect:/users";
	}
}
