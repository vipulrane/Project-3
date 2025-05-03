package com.rindustry.amazon.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rindustry.amazon.ecommerce.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
