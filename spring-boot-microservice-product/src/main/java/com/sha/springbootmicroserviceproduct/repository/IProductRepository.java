package com.sha.springbootmicroserviceproduct.repository;

import com.sha.springbootmicroserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
