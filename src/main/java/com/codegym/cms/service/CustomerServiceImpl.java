package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    private static Map<Integer, Customer> customers;
    static {

        customers = new HashMap<>();
        customers.put(1, new Customer(1L, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2L, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3L, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4L, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(5L, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6L, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
