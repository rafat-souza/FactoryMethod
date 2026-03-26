package testes;

import org.junit.jupiter.api.Test;
import processamentoPagamentos.PagamentoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            PagamentoFactory.obterPagamento("Dinheiro");
            fail("Uma exceção deveria ter sido lançada");
        } catch (IllegalArgumentException e) {
            assertEquals("Método de pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            PagamentoFactory.obterPagamento("Boleto");
            fail("Uma exceção deveria ter sido lançada");
        } catch (IllegalArgumentException e) {
            assertEquals("Método de pagamento inválido", e.getMessage());
        }
    }

}
