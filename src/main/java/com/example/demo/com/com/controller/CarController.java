package com.example.demo.com.com.controller;

import com.example.demo.com.entity.Car;
import com.example.demo.com.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
 @Autowired
 private CarRepository carRepository;
@GetMapping("cool-cars")
@CrossOrigin(origins = "http://localhost:4200")
 public List<Car> afficher(){
     return carRepository.findAll();

 }




}
