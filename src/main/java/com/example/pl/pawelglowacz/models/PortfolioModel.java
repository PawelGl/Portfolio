package com.example.pl.pawelglowacz.models;

import javax.persistence.*;

@Entity
@Table(name = "portfolio")
public class PortfolioModel {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private String imgurl;
    private String content;
    private String title;

    PortfolioModel(){

    }

    public PortfolioModel(String imgurl, String content, String title) {
        this.imgurl = imgurl;
        this.content = content;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
