package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

//ja possui implementacao padrao dos tipos enviados para a JpaRepository
public interface UserRepository  extends JpaRepository<User, Long>{

}
