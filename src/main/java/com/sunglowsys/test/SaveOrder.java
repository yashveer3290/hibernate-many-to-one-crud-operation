package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerServiceImpl;
import com.sunglowsys.service.OrderServiceImpl;

import java.util.ArrayList;

import java.util.List;


public class SaveOrder {

    public static void main(String[] args) {

        Customer customer = new Customer("Aman","Kumar","a01122@gmail.com","8989898989" );
        Customer customer1 = new CustomerServiceImpl().save(customer);

        Customer customer2 = new Customer("Gopal","Kumar","govind011@gmail.com","8989894545");
        Customer customer3 = new CustomerServiceImpl().save(customer2);

        Order order = new Order("Mobile","RedmeNote4","online",customer);
        Order order1 = new Order("Leptop","thinkpad","online",customer);

        Order order2 = new Order("beg","big","online",customer);
        Order order3 = new Order("comics","cortoon","online",customer);

        order.setCustomer(customer);
        order1.setCustomer(customer);
        order2.setCustomer(customer);
        order3.setCustomer(customer);

        List<Order> orders = new ArrayList<>();

        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        new OrderServiceImpl().save(order);
        new OrderServiceImpl().save(order1);
        new OrderServiceImpl().save(order2);
        new OrderServiceImpl().save(order3);
    }
}
