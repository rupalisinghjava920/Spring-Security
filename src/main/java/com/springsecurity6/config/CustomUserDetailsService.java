package com.springsecurity6.config;

import com.springsecurity6.entity.Employee;
import com.springsecurity6.repositroy.EmployeeRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepositroy employeeRepositroy;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Employee employee=employeeRepositroy.findByEmail(email);
        if(employee == null){
            throw new UsernameNotFoundException("Email not found");
        }else{
            return  new CustomUser(employee);
        }
    }
}
