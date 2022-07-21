package com.SpringBoot.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.SpringBoot.entities.User;


public interface OrderRepository extends JpaRepository<User, Long>{

}
