package com.bytesw.customer.repositories;

import com.bytesw.customer.bo.Customer;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.ORACLE)
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
