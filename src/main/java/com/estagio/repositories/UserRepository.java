package com.estagio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estagio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
