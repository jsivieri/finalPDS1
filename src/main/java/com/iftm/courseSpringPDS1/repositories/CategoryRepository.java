package com.iftm.courseSpringPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.courseSpringPDS1.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
