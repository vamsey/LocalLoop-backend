package com.localloop.repository;

import com.localloop.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, Long> {

    List<Business> findByStatus(String status);
    List<Business> findByCategory(String category);

}

