package com.psayol.jsfspringpoc.repository;

import com.psayol.jsfspringpoc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
