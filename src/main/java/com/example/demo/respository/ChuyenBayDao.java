package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.ChuyenBay;

public interface ChuyenBayDao extends JpaRepository<ChuyenBay, String> {
    public List<ChuyenBay> findByGaDen(String gaDen);
}