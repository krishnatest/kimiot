/**
 * 
 */
package com.dxc.ms.iot;

import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author kkumar92
 *
 */
@Controller
public class ApiController {
	protected Logger logger = Logger.getLogger(ApiController.class.getName());
	public String strToken = null;
	
	@Autowired
	UserRepository userRepository;
	//public Users users;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String home(){
		logger.info("Home page called...");
		return "index";
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/wList")
	public String userList(Model model) {
		logger.info("Called index kk2");
		model.addAttribute("jData", userRepository.getAllUsers());
		return "wList";
	}
		
}


	
