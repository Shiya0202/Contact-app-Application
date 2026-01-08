package com.example.Contact.app.Application.service;

import com.example.Contact.app.Application.entity.Contact;
import org.springframework.stereotype.Service;

@Service
public class ContactService
{
    public void processContact(Contact contact) {

        System.out.println("===== New Contact Received =====");
        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Message: " + contact.getMessage());
        System.out.println("================================");
    }
}
