package com.epam.controller;

import bean.Customer;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Andrey_Chadov on 2/6/2017.
 */

@Controller
@RequestMapping("/customer")
public class SignUpController {

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String addCustomer(
            @Valid Customer customer,
            BindingResult result) {
        if (result.hasErrors()) {
            return "SignUpForm";
        } else {
            return "Done";
        }

    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayCustomerForm(ModelMap model) {

        model.addAttribute("customer", new Customer());
        return "SignUpForm";

    }

}
