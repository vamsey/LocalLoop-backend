package com.localloop.service;

import com.localloop.model.Business;
import com.localloop.repository.BusinessRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {

    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public Business registerBusiness(Business business) {
        business.setStatus("PENDING");
        return businessRepository.save(business);
    }

    public List<Business> getApprovedBusinesses() {
        return businessRepository.findByStatus("APPROVED");
    }

    public List<Business> getPendingBusinesses() {
        return businessRepository.findByStatus("PENDING");
    }

    public Business approveBusiness(Long id) {
        Business business = businessRepository.findById(id).orElseThrow();
        business.setStatus("APPROVED");
        return businessRepository.save(business);
    }

    public List<Business> getBusinessesByCategory(String category) {
        return businessRepository.findByCategory(category);
    }
}
