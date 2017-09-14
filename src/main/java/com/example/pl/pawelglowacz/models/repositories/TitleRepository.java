package com.example.pl.pawelglowacz.models.repositories;

import com.example.pl.pawelglowacz.models.TitleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface TitleRepository extends CrudRepository<TitleModel,Integer>{

    Optional<TitleModel> findTitleModelById(int id);


}
