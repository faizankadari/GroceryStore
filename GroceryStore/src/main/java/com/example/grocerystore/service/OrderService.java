package com.example.grocerystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grocerystore.entity.Order;
import com.example.grocerystore.entity.OrderItem;
import com.example.grocerystore.repository.OrderItemRepository;
import com.example.grocerystore.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	public String addOrder(Order order) {
        orderRepository.save(order);

		log.info("Order Completed Successfully");
        return "Order Completed Successfully";
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItemRepository.save(orderItem);
		log.info("Order Completed Successfully");

    }
}
