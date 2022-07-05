package com.sha.springbootmicroserviceproduct.service;

import com.sha.springbootmicroserviceproduct.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
