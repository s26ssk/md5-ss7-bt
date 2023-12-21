package com.ra.service;


import com.ra.dto.request.UserLogin;
import com.ra.dto.request.UserRegister;
import com.ra.dto.response.JwtResponse;
import com.ra.model.Users;

import java.util.List;

public interface IUserService {
	
	void register(UserRegister userRegister);
	
	JwtResponse login(UserLogin userLogin);
	List<Users> getAllUser();
	
}
