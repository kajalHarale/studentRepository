package com.springbootsimple.simpleSpringboot.controller.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootsimple.simpleSpringboot.entity.studentEntity;

@Repository
	 public interface studentRepository extends CrudRepository<studentEntity, Long> {
	}