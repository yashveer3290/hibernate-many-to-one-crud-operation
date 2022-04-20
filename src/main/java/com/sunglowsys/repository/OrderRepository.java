package com.sunglowsys.repository;

import com.sunglowsys.domain.Order;

import java.util.List;

public interface OrderRepository {

    Order save(Order order);

    Order update(Order order,Long id);

    List<Order> findAll();

    Order findById(Long id);

    void delete(Long id);
}
