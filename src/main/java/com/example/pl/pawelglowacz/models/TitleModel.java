package com.example.pl.pawelglowacz.models;

import javax.persistence.*;

@Entity
@Table(name = "titleportfolio")
public class TitleModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private String namesurname;
    private String specjalization;
    public TitleModel(){

    }

    public TitleModel(String nameusername, String specjalization) {
        this.namesurname = nameusername;
        this.specjalization = specjalization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamesurname() {
        return namesurname;
    }

    public void setNamesurname(String namesurname) {
        this.namesurname = namesurname;
    }

    public String getSpecjalization() {
        return specjalization;
    }

    public void setSpecjalization(String specjalization) {
        this.specjalization = specjalization;
    }
}
