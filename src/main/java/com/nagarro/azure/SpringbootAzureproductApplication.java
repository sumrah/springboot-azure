package com.nagarro.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureproductApplication {

	@Autowired
	private ProductRepository repository;

	@PostMapping("/product")
	public Product addproduct(@RequestBody Product product) {
	return repository. save(product) ;

	}

	@GetMapping("/products")
	public List<Product> getProducts() {
	return repository. findAll();

	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureproductApplication.class, args);
	}

}
