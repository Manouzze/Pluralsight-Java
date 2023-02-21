package com.manon.pluralsight.controllers;


import com.manon.pluralsight.models.Session;
import com.manon.pluralsight.models.Speaker;
import com.manon.pluralsight.repositories.SessionRepository;
import com.manon.pluralsight.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SpeakerController {
    @Autowired
    private SpeakerRepository speakerRepository;
    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Speaker> list(){
        return speakerRepository.findAll();
    }
    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(PathVariable Long id){
        return speakerRepository.getOne(id);
    }

    //VERBES HTTP

    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }
}

