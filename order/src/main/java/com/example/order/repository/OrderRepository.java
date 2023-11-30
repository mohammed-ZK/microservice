package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.order.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
