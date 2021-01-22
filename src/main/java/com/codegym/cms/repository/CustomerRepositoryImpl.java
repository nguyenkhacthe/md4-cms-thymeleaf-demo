package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

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
        if(customer.getId() != null) {
            entityManager.merge(customer);
        }
        else {
            entityManager.persist(customer);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
