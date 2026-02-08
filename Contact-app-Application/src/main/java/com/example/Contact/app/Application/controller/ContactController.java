package com.example.Contact.app.Application.controller;

import com.example.Contact.app.Application.entity.Contact;
import com.example.Contact.app.Application.repository.ContactRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactRepo contactRepo;

    public ContactController(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    // Save contact form data (HTML form submission)
    @PostMapping("/contact")
    public Contact submitContact(@ModelAttribute Contact contact) {
        return contactRepo.save(contact);
    }

    // Fetch all contacts (REST API for dashboard)
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
}
