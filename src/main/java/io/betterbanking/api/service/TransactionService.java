package io.betterbanking.api.service;

import io.betterbanking.api.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        var transaction = new Transaction("type",
                "",
                "",
                1,
                1,
                null);
        return Collections.singletonList(transaction);
    }

}
