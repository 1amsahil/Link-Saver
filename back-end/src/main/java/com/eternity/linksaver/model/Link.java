package com.eternity.linksaver.model;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

@Entity
public class Link {
    @Id
    private int id;

    private String url;
    private String summary;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
