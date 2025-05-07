package com.eternity.linksaver.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Link {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String url;
    private String summary;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private Users user;

}
