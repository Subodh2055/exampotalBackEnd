package com.subodh.exampotalbackend.repository;

import com.subodh.exampotalbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Subodh Bhandari
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUserName(String userName);

}
