package com.example.ch16.service.impl;

import com.example.ch16.repository.UserRepository;
import com.example.ch16.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailService {

    private final UserRepository userRepository;

//    @Autowired
//    public UserDetailServiceImpl(UserRepository userRepository){
//        this.userRepository = userRepository;
//    } @RequiredArgsConstructor 으로 대체


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.getByUid(username);
    }
}
