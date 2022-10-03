package com.examly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.entity.Signup;

public interface SignupRepository extends JpaRepository<Signup, Integer>{

	Signup findByEmailAndPassword(String email, String password);

	
}