package com.iftm.courseSpringPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.courseSpringPDS1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
