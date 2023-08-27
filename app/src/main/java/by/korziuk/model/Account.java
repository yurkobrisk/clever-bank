package by.korziuk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {

    private Long id;
    private String number;
    private Currency currency;
    private BigDecimal balance;
    private Date dateOfCreation;
    private Long clientId;
    private Long bankId;
}
