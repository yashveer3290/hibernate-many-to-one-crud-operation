package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Amir");
        customer.setLastName("Khan");
        customer.setEmail("amir011@gmail.com");
        customer.setMobile("9898989898");

        new CustomerServiceImpl().update(customer,1L);

        System.out.println(customer);

    }
}
