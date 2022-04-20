package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.List;

public class FindAllCustomer {
    public static void main(String[] args) {

        List<Customer> customerList = new CustomerServiceImpl().findAll();

            for (Customer customer:customerList) {

                System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getEmail()+" "+customer.getMobile()+" "+customer
                        .getOrderList());
            }

    }
}
