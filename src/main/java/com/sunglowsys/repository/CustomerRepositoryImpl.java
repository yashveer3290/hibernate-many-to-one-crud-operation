package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Customer save(Customer customer) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(customer);
        session.getTransaction().commit();
        session.close();
        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer1 = session.get(Customer.class,id);
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setEmail(customer.getEmail());
        customer1.setMobile(customer.getMobile());
        session.getTransaction().commit();
        session.close();
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        session.getTransaction().commit();
        session.close();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.getTransaction().commit();
        return customer;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.delete(customer);
        session.getTransaction().commit();
        session.close();

    }
}
