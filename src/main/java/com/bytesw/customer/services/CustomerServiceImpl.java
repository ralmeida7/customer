package com.bytesw.customer.services;

import com.bytesw.customer.bo.Customer;
import com.bytesw.customer.repositories.CustomerRepository;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

}
