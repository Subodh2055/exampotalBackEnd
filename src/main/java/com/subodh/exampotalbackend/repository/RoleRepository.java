package com.subodh.exampotalbackend.repository;

import com.subodh.exampotalbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Subodh Bhandari
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
