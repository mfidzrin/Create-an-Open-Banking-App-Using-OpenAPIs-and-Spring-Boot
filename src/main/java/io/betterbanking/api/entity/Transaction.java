package io.betterbanking.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private String type, currency, merchantName;
    private Integer accountNumber, amount;
    private Blob merchantLogo;
}
