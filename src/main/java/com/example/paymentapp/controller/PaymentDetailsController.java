package com.example.paymentapp.controller;

import com.example.paymentapp.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/paymentdetails")
public class PaymentDetailsController {

    final PaymentDetailsService paymentDetailsService;

    

}
