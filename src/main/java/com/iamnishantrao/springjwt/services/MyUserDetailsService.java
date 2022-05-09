package com.iamnishantrao.springjwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    // this method returns a user object for the username passed in the method
    // ideally we get this from a database user table where login details are stored
    // we are hardcoding it for the sake of application
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return new User("helloworld", "helloworld", new ArrayList<>());
    }
}
