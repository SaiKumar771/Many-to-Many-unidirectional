package com.learn.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.entities.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

}
