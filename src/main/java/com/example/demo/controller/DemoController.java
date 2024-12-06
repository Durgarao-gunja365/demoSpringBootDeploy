package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
public class DemoController {
	
	private final List<Customer> customers = new ArrayList<>();

    @GetMapping("/demo1")
    public int demo1() {
        return 42;
    }

    @GetMapping("/demo2")
    public double demo2() {
        return 3.14159;
    }

    @GetMapping("/demo3")
    public String demo3() {
        return "<h1>Welcome to Spring Boot MVC Demo</h1>";
    }

    @GetMapping("/demo4")
    public String demo4() {
        String university = "KLEF";
        return "I Study at " + university;
    }

    @GetMapping("/demo5/{id}")
    public String demo5(@PathVariable int id) {
        return "ID: " + id;
    }

    @GetMapping("/demo6/{a}/{b}")
    public String demo6(@PathVariable int a, @PathVariable int b) {
        return "Sum: " + (a + b);
    }

    @GetMapping("/demo7")
    public String demo7(@RequestParam int id) {
        return "ID: " + id;
    }

    @GetMapping("/demo8/{name}")
    public String demo8(@PathVariable String name) {
        return "Name: " + name;
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Customer Added Successfully";
    }

    @GetMapping("/viewcustomer")
    public List<Customer> viewCustomer() {
        return customers;
    }

}
