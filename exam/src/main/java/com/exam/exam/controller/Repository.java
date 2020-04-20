package com.exam.exam.controller;

import com.exam.exam.entity.Phone;
import com.exam.exam.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Repository {
    @Autowired
    private PhoneRepository  phoneRepository;

    private Phone phone;
    Phone savePhone = phoneRepository.save(phone);

    /*Phone obj = phoneRepository.findById(phoneId).get();
    Iterable<Phone> articles = PhoneRepository.findAll();

    phoneRepository.delete(phone);*/
}
