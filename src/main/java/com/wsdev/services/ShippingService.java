package com.wsdev.services;

import org.springframework.stereotype.Service;

import com.wsdev.entities.Order;

@Service
public class ShippingService {
	

	public Double shipment(Order order) {
		if(order.getBasic() < 100.0) {
			return 20.0;
		}else if(order.getBasic() >= 100 && order.getBasic() < 200.00) {
			return 12.00;
		}else {
			return 0.0;
		}
	}
}
