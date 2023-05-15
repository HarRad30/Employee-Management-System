package com.ems.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ems.springboot.dto.UserRegistrationDto;
import com.ems.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
