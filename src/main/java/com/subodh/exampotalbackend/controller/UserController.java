package com.subodh.exampotalbackend.controller;

import com.subodh.exampotalbackend.model.Role;
import com.subodh.exampotalbackend.model.User;
import com.subodh.exampotalbackend.model.UserRole;
import com.subodh.exampotalbackend.repository.UserRepository;
import com.subodh.exampotalbackend.service.UserService;
import com.subodh.exampotalbackend.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Subodh Bhandari
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    // creating user
    @PostMapping("/add")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user, roles);

    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String userName){
        return this.userService.getUser(userName);

    }

    //delete user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);

    }
}
