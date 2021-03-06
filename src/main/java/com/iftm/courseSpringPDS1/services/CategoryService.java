package com.iftm.courseSpringPDS1.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iftm.courseSpringPDS1.entities.Category;
import com.iftm.courseSpringPDS1.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	@Transactional
	public Category insert(Category category) {
		Category entity = new Category(null, category.getName());		
		entity = repository.save(entity);
		return entity;
	}
}
