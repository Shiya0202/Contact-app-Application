package com.example.Contact.app.Application.repository;

import com.example.Contact.app.Application.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo  extends JpaRepository<Contact, Long> {
}
