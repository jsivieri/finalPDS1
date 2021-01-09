package com.iftm.courseSpringPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.courseSpringPDS1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
