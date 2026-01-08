package com.example.Contact.app.Application.controller;

import com.example.Contact.app.Application.dto.ContactRequestDto;
import com.example.Contact.app.Application.entity.Contact;
import com.example.Contact.app.Application.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ContactController
{
    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public String submitContact(@ModelAttribute ContactRequestDto dto) {

        Contact contact = new Contact(
                dto.getName(),
                dto.getEmail(),
                dto.getMessage()
        );

        contactService.processContact(contact);

        return "Form submitted successfully!";
    }
}
