package com.dailycodebuffer.ProductService.service;

import com.dailycodebuffer.ProductService.model.ProductRequest;
import com.dailycodebuffer.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProductService {

    long addProduct(ProductRequest productRequest);
}
