/**
 * 
 */
package com.rest.service;

import java.util.List;

import com.rest.dao.UserDao;
import com.rest.domain.User;

/**
 * @author ARATI-AMOL
 *
 */
public class UserService {
	
	UserDao userDao = new UserDao();

	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}

}
