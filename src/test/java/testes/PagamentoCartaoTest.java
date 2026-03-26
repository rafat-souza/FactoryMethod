package testes;

import org.junit.jupiter.api.Test;
import processamentoPagamentos.IPagamento;
import processamentoPagamentos.PagamentoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoCartaoTest {
    @Test
    void deveProcessarPagamentoCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão de Crédito processado", pagamento.processar());
    }

    @Test
    void deveEstornarPagamentoCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento via Cartão de Crédito estornado", pagamento.estornar());
    }
}
