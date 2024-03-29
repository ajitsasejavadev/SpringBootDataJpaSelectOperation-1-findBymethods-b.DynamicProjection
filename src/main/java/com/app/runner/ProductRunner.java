package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.MyData;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		repo.findByProdCost(5.5, MyData.class)
		.forEach(p->System.out.println(p.getProdCode()+","+p.getProdName()));
	}

}
