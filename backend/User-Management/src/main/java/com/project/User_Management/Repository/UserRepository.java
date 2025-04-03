package com.project.User_Management.Repository;

import com.project.User_Management.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String Email);

    User getUserById(Long id);
}
