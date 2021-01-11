package com.iftm.courseSpringPDS1.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iftm.courseSpringPDS1.dto.OrderDTO;
import com.iftm.courseSpringPDS1.dto.UserDTO;
import com.iftm.courseSpringPDS1.entities.Order;
import com.iftm.courseSpringPDS1.repositories.OrderRepository;
import com.iftm.courseSpringPDS1.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
		
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findAll();
		return list.stream().map(e -> new OrderDTO(e)).collect(Collectors.toList());
	}
	
	public OrderDTO findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		Order entity = obj.orElseThrow(() -> new ResourceNotFoundException(id));
		return new OrderDTO(entity);
	}	

}
