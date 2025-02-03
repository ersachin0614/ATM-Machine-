package com.example.atm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMController {

    private double balance = 10000;

    // Check balance (GET request)
    @GetMapping("/balance")
    public String checkBalance() {
        return "Your current balance is: ₹" + balance;
    }

    // Withdraw money (POST request)
    @PostMapping("/withdraw")
    public String withdrawMoney(@RequestParam double amount) {
        if (amount > balance) {
            return "Insufficient funds!";
        }
        balance -= amount;
        return "Withdrawal successful! Remaining balance: ₹" + balance;
    }

    // Deposit money (POST request)
    @PostMapping("/deposit")
    public String depositMoney(@RequestParam double amount) {
        balance += amount;
        return "Deposit successful! New balance: ₹" + balance;
    }
}
