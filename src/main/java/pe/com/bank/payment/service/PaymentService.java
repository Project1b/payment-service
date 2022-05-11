package pe.com.bank.payment.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pe.com.bank.payment.client.AccountRestClient;
import pe.com.bank.payment.client.CreditRestClient;
import pe.com.bank.payment.client.TransactionRestClient;
import pe.com.bank.payment.entity.AccountDTO;
import pe.com.bank.payment.entity.CreditDTO;
import pe.com.bank.payment.entity.PaymentEntity;
import pe.com.bank.payment.entity.TransactionDTO;
import reactor.core.publisher.Mono;

import java.util.List;

@AllArgsConstructor
@Service
public class PaymentService {


    CreditRestClient creditRestClient;
    AccountRestClient accountRestClient;
    TransactionRestClient transactionRestClient;

    public Mono<PaymentEntity> createPayment(PaymentEntity paymentEntity) {

//    var creResCli=   creditRestClient.retrieveCreditA(paymentEntity.getCreditId());
  //   var creAccCli=   accountRestClient.retrieveAccountA(paymentEntity.getAccountId());
//        creditRestClient.updateCreditA(new CreditDTO("1","","","","","","re"), paymentEntity.getCreditId());
//        accountRestClient.updateAccountA(new AccountDTO("","",1.0,"","","",""), paymentEntity.getAccountId());
//        transactionRestClient.createTransactionA(new TransactionDTO("1","1","1","1","1"));
        return Mono.empty();
    }


}
