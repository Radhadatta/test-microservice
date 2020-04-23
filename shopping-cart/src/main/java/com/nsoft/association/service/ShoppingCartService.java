package com.nsoft.association.service;

import com.nsoft.association.exception.NotEnoughProductsInStockException;
import com.nsoft.association.model.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
