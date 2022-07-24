package com.subodh.exampotalbackend.service;

import com.subodh.exampotalbackend.model.User;
import com.subodh.exampotalbackend.model.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Subodh Bhandari
 */
@Service
public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by userName
    public User getUser(String userName);
}
