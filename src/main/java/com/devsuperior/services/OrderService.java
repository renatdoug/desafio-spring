package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entites.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService taxShipping;

 
    public double total(Order order) {
        return order.getBasic() * (1 - order.getDiscount() / 100d) + taxShipping.shipment(order);
    }
}
