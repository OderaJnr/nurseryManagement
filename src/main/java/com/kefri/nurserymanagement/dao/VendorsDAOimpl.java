package com.kefri.nurserymanagement.dao;

import com.kefri.nurserymanagement.model.Vendors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendorsDAOimpl implements  VendorsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int save(Vendors vendors) {
        return 0;
    }

    @Override
    public int update(Vendors vendors, int id) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Vendors> getAll() {
        return  jdbcTemplate.query("SELECT * FROM tbl_nursery_vendors",new BeanPropertyRowMapper<Vendors>(Vendors.class));
    }

    @Override
    public Vendors getbyId(int id) {
        return null;
    }
}