package com.etherealhazel.spring.core.demo.app.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CargoPants implements Pants{

    public CargoPants() {
    }
    
    @Override
    public void wear() {
        System.out.println("Cargo Pants are being worn");
    }
}
