package com.h2.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.h2.demo.domain.OemEntity;

@Repository
public interface OemService {
	List<OemEntity> getOems();
	Boolean addOem(OemEntity entity);
}
