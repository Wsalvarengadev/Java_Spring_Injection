package com.wsdev.Dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wsdev.entities.Order;
import com.wsdev.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.wsdev"})
public class DependenciesApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	
	public static void main(String[] args) {
		SpringApplication.run(DependenciesApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034,150.00,20.0);
		System.out.println(order);
		System.out.printf("Valor total: R$%.2f%n", orderService.total(order));
		
	}

}
