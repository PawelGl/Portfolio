package com.example.pl.pawelglowacz.models.repositories;

import com.example.pl.pawelglowacz.models.PortfolioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PortfolioRepository extends CrudRepository<PortfolioModel,Integer> {


}
