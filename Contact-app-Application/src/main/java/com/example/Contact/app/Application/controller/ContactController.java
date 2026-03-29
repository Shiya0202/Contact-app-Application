package com.example.Contact.app.Application.controller;

import com.example.Contact.app.Application.entity.Contact;
import com.example.Contact.app.Application.repository.ContactRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ContactController {

    private final ContactRepo repo;

    public ContactController(ContactRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/contact")
    public Contact save(Contact contact) {
        return repo.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAll() {
        return repo.findAll();
    }
}

