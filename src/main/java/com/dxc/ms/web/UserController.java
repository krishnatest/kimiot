/**
 * 
 */
package com.dxc.ms.web;

import java.util.logging.Logger;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class UserController {
	protected Logger logger = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String home(){
		logger.info("Called index kk1");
		return "index";
	}
	@RequestMapping("/userList")
	public String userList(Model model) {
		logger.info("Called index kk2");
		model.addAttribute("users", userRepository.getAllUsers());
		return "userList";
	}
	
}
