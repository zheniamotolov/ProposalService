package com.projet.proposal.model;


import com.projet.proposal.model.audit.UserDateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "proposals")
public class Proposal extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String request;


    @NotBlank
    @NotNull
    private Double bid;

    @NotNull
    private Instant due_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Instant getDue_date() {
        return due_date;
    }

    public void setDue_date(Instant due_date) {
        this.due_date = due_date;
    }
}
