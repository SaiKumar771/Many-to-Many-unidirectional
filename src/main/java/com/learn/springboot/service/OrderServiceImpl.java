package com.learn.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.Repository.IOrderRepo;
import com.learn.springboot.entities.Order;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepo orderRepo;
	
	@Override
	public Order saveOrder(Order order) {
		return  orderRepo.saveAndFlush(order);
		
	}

	@Override
	public Order getOrder(int orderId) {	
		return orderRepo.findById(orderId).get();
	}

	@Override
	public List<Order> getOrders() {
		return orderRepo.findAll();
	}

	@Override
	public List<Order> saveOrders(List<Order> orders) {
		return orderRepo.saveAllAndFlush(orders);
	}

	public String deleteOrder(int orderId)
	{
		orderRepo.deleteById(orderId);
	return "Order with id:"+orderId+" deleted";	
	}
	
	public String deleteOrders()
	{		
		orderRepo.deleteAll();
	return "Orders are deleted";	
	}

	@Override
	public Order updateOrder(Order ord) {
		
		ord.setOrderDate(ord.getOrderDate());
		return orderRepo.saveAndFlush(ord);
	}
}
