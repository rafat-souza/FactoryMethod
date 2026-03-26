package testes;

import org.junit.jupiter.api.Test;
import processamentoPagamentos.IPagamento;
import processamentoPagamentos.PagamentoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoPixTest {
    @Test
    void deveProcessarPagamentoPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix processado", pagamento.processar());
    }

    @Test
    void deveEstornarPagamentoPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via Pix estornado", pagamento.estornar());
    }
}
