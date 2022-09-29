package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ChuyenBay;

public interface ChuyenBayService {
	//1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> findByGaDen(String gaDen);


}
