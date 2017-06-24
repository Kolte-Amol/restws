/**
 * 
 */
package com.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.domain.User;
import com.rest.service.UserService;

/**
 * @author ARATI-AMOL
 *
 */
@RestController
public class UserController {

	UserService userService = new UserService(); 
	
	@RequestMapping("/")
    public List<User> getUser() 
    {
		return userService.getAllUsers(); 
    }
}
