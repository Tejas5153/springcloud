package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;

import java.util.List;

public interface ContactService
{
    public List<Contact> getContactOfUserId(Long userId);
}
