package io.betterbanking.api.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {

    @InjectMocks
    private TransactionService transactionService;

    @Test
    void findAllByAccountNumber() {

        var allByAccountNumber = transactionService.findAllByAccountNumber(1);

        assertThat(allByAccountNumber.size()).isGreaterThan(0);
    }
}
