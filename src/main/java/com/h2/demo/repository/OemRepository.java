package com.h2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.demo.domain.OemEntity;

public interface OemRepository extends JpaRepository<OemEntity, Long> {
	
}
