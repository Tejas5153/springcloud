package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService
{
    List<Contact> list=List.of(
            new Contact(1L,"swapnil@gmail.com","Swapnil",2122L),
            new Contact(2L,"mohit@gmail.com","Mohit",2123L),
            new Contact(3L,"hitesh@gmail.com","Hitesh",2124L),
            new Contact(4L,"tejas@gmail.com","Tejas",2125L));
    @Override
    public List<Contact> getContactOfUserId(Long userId) {
        return list.stream().filter(contact -> contact.getUserId()==(userId)).collect(Collectors.toList());
    }
}
