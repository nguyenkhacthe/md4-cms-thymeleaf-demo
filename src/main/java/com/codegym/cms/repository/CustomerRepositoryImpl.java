package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }
}
