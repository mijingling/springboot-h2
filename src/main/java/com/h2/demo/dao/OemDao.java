package com.h2.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.h2.demo.domain.OemEntity;

@Repository
public interface OemDao {
	List<OemEntity> getOems();
	Boolean addOem(OemEntity entity);
}
