package processamentoPagamentos;

public class PagamentoFactory {
    public static IPagamento obterPagamento(String tipo) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("processamentoPagamentos.Pagamento" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Método de pagamento inexistente");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Método de pagamento inválido");
        }
        return (IPagamento) objeto;
    }
}
