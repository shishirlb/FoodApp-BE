package com.clarivate.FoodApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodApp.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{
	
	List<Category> getAllCategory();
	
}
