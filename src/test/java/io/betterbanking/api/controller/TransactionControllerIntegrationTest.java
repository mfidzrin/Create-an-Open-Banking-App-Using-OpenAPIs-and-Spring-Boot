package io.betterbanking.api.controller;

import io.betterbanking.api.entity.Transaction;
import io.betterbanking.api.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TransactionController.class)
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService transactionService;

    @Test
    void findAllByAccountNumber() throws Exception {
        var transaction = new Transaction("type",
                "",
                "",
                1,
                1,
                null);

        given(transactionService.findAllByAccountNumber(1))
                .willReturn(Collections.singletonList(transaction));

        mockMvc.perform(get("/transactions")
                .param("accountNumber", "1"))
                .andExpect(status().isOk());
    }
}
