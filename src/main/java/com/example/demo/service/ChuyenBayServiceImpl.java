package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.respository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {

	@Autowired 
	private ChuyenBayRepository chuyenBayRepository;
	
	
	//1
	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findByGaDen(gaDen);
	}}

