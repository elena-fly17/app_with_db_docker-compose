package com.giacom.databasedemo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giacom.databasedemo.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

