package com.marcuschiu.h2databaseexample.controller;

import com.marcuschiu.h2databaseexample.model.Billionaire;
import com.marcuschiu.h2databaseexample.repository.BillionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class DefaultController {

    @Autowired
    BillionaireRepository billionaireRepository;

    /**
     * http://localhost:8080/api/billionaire/1
     * @param optionalID
     * @return
     */
    @RequestMapping(value="/billionaire/{id}", method = RequestMethod.GET)
    public @ResponseBody String get(@PathVariable("id") Optional<Long> optionalID) {
        if (optionalID.isPresent()) {
            Long id = optionalID.get();
            System.out.println(id.toString());
            Optional<Billionaire> optionalBillionaire = billionaireRepository.findById(id);
            if (optionalBillionaire.isPresent()) {
                Billionaire billionaire = optionalBillionaire.get();
                return billionaire.toString();
            } else {
                return "no billionaire found with that id";
            }
        } else {
            return "http://localhost:8080/api/billionaire/{id}";
        }
    }
}
