package processamentoPagamentos;

public class PagamentoCartao implements IPagamento {
    public String processar() {
        return "Pagamento via Cartão de Crédito processado";
    }

    public String estornar() {
        return "Pagamento via Cartão de Crédito estornado";
    }
}
