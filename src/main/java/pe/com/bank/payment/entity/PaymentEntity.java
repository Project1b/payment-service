package pe.com.bank.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    private Double amount;
    private String creditId;
    private String accountId;
    private String date;
    private String type;
}
