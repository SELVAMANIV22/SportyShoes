package com.SportyShoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SportyShoes.Repository.ProductRepository;
import com.SportyShoes.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/all")
	public List<Product> allProduct() {
		List<Product> list = (List<Product>) productRepository.findAll();
		return list;
	}

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	@PutMapping("/product/{id}")
	public Product updateProduct(@RequestBody Product product )
	{
		return productRepository.save(product);
	}
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productRepository.deleteById(id);
	}
     
}
