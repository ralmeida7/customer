package com.bytesw.customer.bo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    private Integer id;
    private String name;
    @Column(name = "DOCUMENT_TYPE")
    private String documentType;
    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(documentType, customer.documentType) &&
                Objects.equals(documentNumber, customer.documentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, documentType, documentNumber);
    }
}
