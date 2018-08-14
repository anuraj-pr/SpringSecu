package com.apt.APT.auth.UserService;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component(value="userService")
public class UserServicesImpl implements UserDetailsService,UserService {

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		User user=new User("apr", "$2a$10$BbnAyIJTXfBlaWPEHONeQO4IyiY8LPy9b/qzB6qmvQtdvGTpcRLMC", getAuthority());
		return user;
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

}
