package com.devsuperior.desafioSpringBootComponentesEInjecao;

import com.devsuperior.desafioSpringBootComponentesEInjecao.entities.Order;
import com.devsuperior.desafioSpringBootComponentesEInjecao.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DesafioSpringBootComponentesEInjecaoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService = new OrderService();

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SpringApplication.run(DesafioSpringBootComponentesEInjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(001, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: $ %.2f%n", orderService.total(order));
	}

}
