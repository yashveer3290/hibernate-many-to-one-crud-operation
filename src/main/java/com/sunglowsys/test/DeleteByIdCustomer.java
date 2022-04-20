package com.sunglowsys.test;

import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;
import com.sunglowsys.service.CustomerService;
import com.sunglowsys.service.CustomerServiceImpl;

public class DeleteByIdCustomer {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        customerRepository.delete(5L);
    }
}
