package com.localloop.controller;

import com.localloop.model.Business;
import com.localloop.service.BusinessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    private final BusinessService businessService;

    public AdminController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/pending")
    public List<Business> getPendingBusinesses() {
        return businessService.getPendingBusinesses();
    }

    @PutMapping("/approve/{id}")
    public Business approveBusiness(@PathVariable Long id) {
        return businessService.approveBusiness(id);
    }
}
