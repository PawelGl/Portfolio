package com.example.pl.pawelglowacz.controllers;

import com.example.pl.pawelglowacz.models.PortfolioModel;
import com.example.pl.pawelglowacz.models.TitleModel;
import com.example.pl.pawelglowacz.models.repositories.PortfolioRepository;
import com.example.pl.pawelglowacz.models.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    TitleRepository titleRepository;

    @Autowired
    PortfolioRepository portfolioRepository;

    @ModelAttribute("messages")
    TitleModel model() {

        return titleRepository.findOne(1);
    }

    @ModelAttribute("projects")
    List<PortfolioModel> portfolioModelList(){

     return (List<PortfolioModel>) portfolioRepository.findAll();
    }

    @GetMapping("/")
    public String showIndex(){


        return "index";
    }


}
