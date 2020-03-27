package com.bytesw.customer.controllers;

import com.bytesw.customer.bo.Customer;
import com.bytesw.customer.services.CustomerService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.Optional;

@Controller("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Get("/{id}")
    public HttpResponse<Customer> findById(@PathVariable Integer id) {
        Optional<Customer> optionalCustomer = customerService.findById(id);
        return optionalCustomer.isPresent() ? HttpResponse.ok(optionalCustomer.get()) : HttpResponse.notFound(null);
    }

    @Post("/new")
    public HttpResponse<Customer> save(@Body Customer customer) {
        Customer save = customerService.save(customer);
        return HttpResponse.ok(save);
    }

}
