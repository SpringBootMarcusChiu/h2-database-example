package com.marcuschiu.h2databaseexample.repository;

import com.marcuschiu.h2databaseexample.model.Billionaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionaireRepository extends CrudRepository<Billionaire, Long> { }