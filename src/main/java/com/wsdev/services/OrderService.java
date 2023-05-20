package com.wsdev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsdev.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public Double total(Order order) {
		return order.getBasic() - (order.getDiscount() /100 * order.getBasic()) + shippingService.shipment(order);
	}
}
