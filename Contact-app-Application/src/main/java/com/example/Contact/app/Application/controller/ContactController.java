package com.example.Contact.app.Application.controller;

import com.example.Contact.app.Application.entity.Contact;
import com.example.Contact.app.Application.repository.ContactRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ContactController {

    private final ContactRepo contactRepo;

    public ContactController(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    // Save contact form data
    @PostMapping("/contact")
    public String submitContact(@ModelAttribute Contact contact) {
        contactRepo.save(contact);
        return "redirect:/";
    }

    // Fetch all contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
}