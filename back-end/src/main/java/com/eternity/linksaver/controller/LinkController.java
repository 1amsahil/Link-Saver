package com.eternity.linksaver.controller;

import com.eternity.linksaver.model.Link;
import com.eternity.linksaver.model.Users;
import com.eternity.linksaver.service.CustomUserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.eternity.linksaver.service.LinkService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/link")
public class LinkController {

    @Autowired
    private LinkService service;

    @Autowired
    private CustomUserService userService;

    @PostMapping("/add")
    public Link saveLink(@RequestBody Link link) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Users user = userService.getUser(username);
        link.setUser(user);
        return service.saveLink(link);
    }

    @GetMapping("/show")
    public List<Link> getUserLinks() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Users user = userService.getUser(username);
        return service.getLinksByUser(user);
    }
    
}
