package com.ddd.uc9.domain.domainservice;

import com.ddd.uc9.domain.Cart;
import com.ddd.uc9.domain.Item;
import com.ddd.uc9.domain.Order;
import com.ddd.uc9.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class CheckOutService {

    public static Order checkOut(Cart cart) {
        cart.checkOut1();
        List<Item> items = cart.getItems();
        List<Product> products = items.stream().flatMap(item ->
                item.getFlattenedProducts().stream()).collect(Collectors.toList());
        return new Order(products);
    }
}
