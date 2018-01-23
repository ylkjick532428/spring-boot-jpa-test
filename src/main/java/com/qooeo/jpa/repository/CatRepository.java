package com.qooeo.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.qooeo.jpa.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Integer> { 

}
