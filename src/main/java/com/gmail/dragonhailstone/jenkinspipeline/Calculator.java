package com.gmail.dragonhailstone.jenkinspipeline;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
