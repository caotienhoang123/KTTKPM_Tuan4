package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.NhanVien;

public interface NhanVienDao extends JpaRepository<NhanVien, String> {
    @Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000",nativeQuery = true)
    public List<NhanVien> findByLuongNhoHon10000();
}
