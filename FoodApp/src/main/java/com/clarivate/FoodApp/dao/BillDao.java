package com.clarivate.FoodApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodApp.model.Bill;

public interface BillDao extends JpaRepository<Bill, Integer>{

}
