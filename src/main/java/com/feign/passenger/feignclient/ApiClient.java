package com.feign.passenger.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feign.passenger.model.Passenger;


import java.util.List;
@FeignClient(value = "instantwebtools-api", url = "https://api.instantwebtools.net/v1/passenger/:id")
public interface ApiClient {
    @RequestMapping(method = RequestMethod.GET, value = "/passenger")
    List<Passenger> readPassenger();
    @RequestMapping(method = RequestMethod.GET, value = "/passenger/{passengerId}")
    Passenger readPassengerById(@PathVariable("passengerId") String passengerId);
}