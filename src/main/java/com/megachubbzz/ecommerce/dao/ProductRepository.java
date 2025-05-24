package com.megachubbzz.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.megachubbzz.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
