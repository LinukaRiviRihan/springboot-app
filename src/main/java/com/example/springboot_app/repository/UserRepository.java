package com.example.springboot_app.repository;

import com.example.springboot_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE id = ?1", nativeQuery = true)
    User getUserById(Integer userId);
}
