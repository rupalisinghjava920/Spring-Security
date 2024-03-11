package com.springsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ProjectSecurityConfig  {


    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                .antMatchers("/notices", "/contact").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();

     //   Configuration to deny all the requests

//        http.authorizeHttpRequests().anyRequest().denyAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();

        // Configuration to permit all the requests

//        http.authorizeHttpRequests().anyRequest().permitAll()
//                .and().formLogin()
//                .and().httpBasic();
//        return http.build();
    }
//    public InMemoryUserDetailsManager userDetailsManager(){
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("1234")
//                .authorities("admin")
//                .build();
//        UserDetails user=User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin,user);
//
//    }
//    public InMemoryUserDetailsManager userDetailsManager() {
//        UserDetails admin = User.withUsername("admin")
//                .password("4321")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withUsername("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//
//     public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//     }
}
