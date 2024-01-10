package com.naveen.cloneLinkedIn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.cloneLinkedIn.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

}
