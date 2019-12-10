package com.h2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.h2.demo.domain.OemEntity;
import com.h2.demo.service.OemService;

@RestController
public class H2Controller {
	@Autowired
	private OemService oemService;

	@GetMapping("/")
	public String index() {
		StringBuilder resultStb = new StringBuilder();
		resultStb.append("~~~~~~~ Hello H2^^ ~~~~~~~~~~<br/>")
		.append("<a href=\"/selectOemList\" target=\"_blank\">selectOemList</a><br/>")
		.append("<a href=\"/addOem\" target=\"_blank\">addOem</a><br/>");
		return resultStb.toString();
	}

	@GetMapping("/selectOemList")
	public String selectOemList() {
		List<OemEntity> result = oemService.getOems();
		System.out.println(result);
		return JSON.toJSONString(result);
	}

	@GetMapping("/addOem")
	public String addOem() {
		OemEntity entity = new OemEntity();
		String imgBase64="test";
		entity.setImgBase64(imgBase64);
		Boolean result = oemService.addOem(entity);
		return "##操作结果##" + result;
	}
	
}
