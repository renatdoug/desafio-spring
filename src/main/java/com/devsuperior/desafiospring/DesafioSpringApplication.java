package com.devsuperior.desafiospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entites.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioSpringApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Criando um objeto Order
        Order order = new Order(1309, 95.90, 0.0); 
		
		System.out.println("Pedido código " + order.getCode());
        System.out.printf("Total do pedido: R$ %.2f%n", orderService.total(order));
	}

}
