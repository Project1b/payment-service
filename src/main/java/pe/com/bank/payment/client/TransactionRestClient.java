package pe.com.bank.payment.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pe.com.bank.payment.entity.TransactionDTO;
import reactor.core.publisher.Mono;

@Component
public class TransactionRestClient {

    private WebClient webClient;

    @Value("http://localhost:8094/v1")
    private String transactionUrl;


    public TransactionRestClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<TransactionDTO> createTransactionA(TransactionDTO transactionDTO){
        var url = transactionUrl.concat("/transaction");
        return webClient.post()
                .uri(url)
                .body(Mono.just(transactionDTO), TransactionDTO.class)
                .retrieve()
                .bodyToMono(TransactionDTO.class);
    }


}
