package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class FindByIdCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer = new CustomerServiceImpl().findById(1L);

        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getMobile());
    }
}
