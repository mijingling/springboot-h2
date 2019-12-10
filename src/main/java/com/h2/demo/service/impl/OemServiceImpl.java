package com.h2.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h2.demo.dao.OemDao;
import com.h2.demo.domain.OemEntity;
import com.h2.demo.service.OemService;

@Component
public class OemServiceImpl implements OemService{

	@Autowired
	private OemDao oemDao;
	
	@Override
	public List<OemEntity> getOems() {
		return oemDao.getOems();
	}

	@Override
	public Boolean addOem(OemEntity entity) {
		return oemDao.addOem(entity);
	}

}
