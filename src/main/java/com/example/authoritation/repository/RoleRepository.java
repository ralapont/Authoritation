package com.example.authoritation.repository;

import com.example.authoritation.entities.ERole;
import com.example.authoritation.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
