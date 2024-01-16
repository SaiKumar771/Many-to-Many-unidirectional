package com.learn.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.entities.Order;
import com.learn.springboot.service.IOrderService;

@RestController
@RequestMapping("/OrderInfo")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@PostMapping("/order")
	public ResponseEntity<Order> postOrder(@RequestBody Order order)
	{	
		Order ord=orderService.saveOrder(order);
		return new ResponseEntity<Order>(ord,HttpStatus.CREATED);
	}
	
	@GetMapping("/order/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable("id") int orderId)
	{
		Order ord=orderService.getOrder(orderId);
		return new ResponseEntity<Order>(ord,HttpStatus.FOUND);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrders()
	{
		List<Order> listOrder=orderService.getOrders();
		
		return new ResponseEntity<List<Order>>(listOrder,HttpStatus.FOUND);
	}
	
	@PostMapping("/orderss")
	public ResponseEntity<List<Order>> postOrders(@RequestBody List<Order> orders)
	{	
		List<Order> listOrder=orderService.saveOrders(orders);
		
		return new ResponseEntity<List<Order>>(listOrder,HttpStatus.FOUND);		
	}
	
	
	@DeleteMapping("orders/{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable("id") int orderId)
	{
		String ord=orderService.deleteOrder(orderId);
		return new ResponseEntity<String>(ord,HttpStatus.OK);
		
	}

	@DeleteMapping("orders")
	public ResponseEntity<String> deleteOrders()
	{
		String ord=orderService.deleteOrders();
		return new ResponseEntity<String>(ord,HttpStatus.OK);
		
	}
	
	@PutMapping("ord")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order)
	{
		Order ord=orderService.updateOrder(order);
		return new ResponseEntity<Order>(ord,HttpStatus.CREATED);
	}
}
