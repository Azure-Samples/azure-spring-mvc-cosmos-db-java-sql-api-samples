package com.spring.cosmos.ebookstore.model.cart;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CosmosRepository<Cart, String> {

}
