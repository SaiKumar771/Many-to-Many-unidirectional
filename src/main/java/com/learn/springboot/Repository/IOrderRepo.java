package com.learn.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.entities.Order;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer> {

}
