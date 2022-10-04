package com.feign.passenger.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feign.passenger.feignclient.ApiClient;

 

@RestController
@RequestMapping(value = "/passenger")
public class PassengerController {
    private final ApiClient apiClient;
    
    public PassengerController (ApiClient apiClient) {
    	this.apiClient = apiClient;
    }
    @GetMapping("/{passengerId}")
    public ResponseEntity readPassengerData (@RequestParam("passengerId") String passengerId) {
        if (passengerId == null) {
            return ResponseEntity.ok(apiClient.readPassenger());
        }
        return ResponseEntity.ok(apiClient.readPassengerById(passengerId));
    }
}