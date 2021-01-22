package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    //region INSERT
    @GetMapping("/add")
    public ModelAndView showInsertForm() {
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView insertCustomer(@ModelAttribute("customer") Customer customer) {
//    public ModelAndView insertCustomer(@RequestParam String name, @RequestParam String email, @RequestParam String address) {
        customerService.save(customer);
//        Customer customer = new Customer(name, email, address);
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("message", "Insert OK");
        return modelAndView;
    }
    //endregion
}
