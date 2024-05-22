package com.estagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estagio.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
