package com.dailycodebuffer.ProductServoce.repository;

import com.dailycodebuffer.ProductServoce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
