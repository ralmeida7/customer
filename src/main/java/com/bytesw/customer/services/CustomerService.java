package com.bytesw.customer.services;

import com.bytesw.customer.bo.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findById(Integer id);

    Customer save(Customer customer);
}
