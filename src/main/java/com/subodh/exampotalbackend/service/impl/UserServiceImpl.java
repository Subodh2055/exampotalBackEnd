package com.subodh.exampotalbackend.service.impl;

import com.subodh.exampotalbackend.model.User;
import com.subodh.exampotalbackend.model.UserRole;
import com.subodh.exampotalbackend.repository.RoleRepository;
import com.subodh.exampotalbackend.repository.UserRepository;
import com.subodh.exampotalbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Subodh Bhandari
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

//creating User
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception{
       User local = this.userRepository.findByUserName(user.getUserName());
       if(local!= null){
           System.out.println("User is already there!!");
           throw new Exception("User already present");
       }else{
           //user create
           for(UserRole ur: userRoles){
               roleRepository.save(ur.getRole());
           }
           user.getUserRoles().addAll(userRoles);
           local = this.userRepository.save(user);
       }
        return local;
    }
}
