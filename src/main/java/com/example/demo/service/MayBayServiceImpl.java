package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.respository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService {

	@Autowired
	private MayBayRepository mayBayRepository;
	
	
	//2
	@Override
	public List<String> findByTamBayLonHon10000() {
		// TODO Auto-generated method stub
		return mayBayRepository.findByTamBayLonHon10000();
	}
}
