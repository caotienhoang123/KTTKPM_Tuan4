package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.MayBay;

public interface MaybayDao extends JpaRepository<MayBay, Integer> {
    @Query(value = "select loai from [dbo].[maybay] where [TamBay]>10000", nativeQuery = true)
    public List<String> findByTamBayLonHon10000();

}
