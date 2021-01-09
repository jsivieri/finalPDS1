package com.iftm.courseSpringPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.courseSpringPDS1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
