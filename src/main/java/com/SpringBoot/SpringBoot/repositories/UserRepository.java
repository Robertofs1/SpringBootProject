package com.SpringBoot.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.SpringBoot.entities.Order;


public interface UserRepository extends JpaRepository<Order, Long>{

}
