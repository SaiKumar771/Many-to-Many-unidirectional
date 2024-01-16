package com.learn.springboot.service;

import java.util.List;

import com.learn.springboot.entities.Order;

public interface IOrderService {
	
	public Order saveOrder(Order order);
	
	public Order getOrder(int id);
	
	public List<Order> getOrders();

	public List<Order> saveOrders(List<Order> orders);
	
	public String deleteOrder(int id);
	
	public String deleteOrders();

	public Order updateOrder(Order ord);

}
