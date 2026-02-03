package com.risk.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskController {
    
    @GetMapping("/api/portfolio/health")
    public String health() {
        return "Risk & PnL Calculator running! HK investment bank ready.";
    }
    
    @GetMapping("/api/risk/hsbc")
    public String hsbcRisk() {
        return "HSBC Portfolio: Exposure HKD 10.5M, VaR 2.3%, PnL +1.2%";
    }
}
