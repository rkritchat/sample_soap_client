package com.example.soapclient.controller;

import com.example.soapclient.soapclient.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConvertNumToWordController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping(value = "/{num}")
    public String convertNumberToWord(@PathVariable("num") String number){

        return soapClient.convertNumberToWord(number);
    }
}
