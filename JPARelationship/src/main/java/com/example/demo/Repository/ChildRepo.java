package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Child;

public interface ChildRepo extends JpaRepository<Child,Integer>{

}
