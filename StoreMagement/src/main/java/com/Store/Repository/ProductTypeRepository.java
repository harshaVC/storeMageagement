package com.Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Store.model.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType,Integer> {

}
