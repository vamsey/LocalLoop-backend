package com.localloop.controller;

import com.localloop.model.Business;
import com.localloop.service.BusinessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/business")
@CrossOrigin
public class BusinessController {

    private final BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @PostMapping("/register")
    public Business registerBusiness(@RequestBody Business business) {
        return businessService.registerBusiness(business);
    }

    @GetMapping("/approved")
    public List<Business> getApprovedBusinesses() {
        return businessService.getApprovedBusinesses();
    }

    @GetMapping("/category/{category}")
    public List<Business> getByCategory(@PathVariable String category) {
        return businessService.getBusinessesByCategory(category);
    }
}

