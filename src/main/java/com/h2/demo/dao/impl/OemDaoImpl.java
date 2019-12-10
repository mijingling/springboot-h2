package com.h2.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h2.demo.dao.OemDao;
import com.h2.demo.domain.OemEntity;
import com.h2.demo.repository.OemRepository;

@Component
public class OemDaoImpl implements OemDao {
	
	@Autowired
	private OemRepository oemRepository;
	
	@Override
	public List<OemEntity> getOems() {
		return oemRepository.findAll();
	}

	@Override
	public Boolean addOem(OemEntity entity) {
		oemRepository.save(entity);
		return true;
	}

}
