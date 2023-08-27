package by.korziuk.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Transaction implements Serializable {

    private Long id;
    private BigDecimal amount;
    private Date timeOfTransaction;
    private Type type;
    private Long senderAccountId;
    private Long recipientAccountId;

}
