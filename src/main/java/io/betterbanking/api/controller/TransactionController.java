package io.betterbanking.api.controller;

import io.betterbanking.api.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions")
    public ResponseEntity<?> findAllByAccountNumber(
            @RequestParam Integer accountNumber) {
        var allByAccountNumber = transactionService.findAllByAccountNumber(accountNumber);
        return ResponseEntity.ok(allByAccountNumber);
    }
}
