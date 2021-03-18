package com.SportyShoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SportyShoes.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
