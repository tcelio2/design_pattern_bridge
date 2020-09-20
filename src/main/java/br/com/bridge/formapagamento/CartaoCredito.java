package br.com.bridge.formapagamento;

import br.com.bridge.imposto.Imposto;

public class CartaoCredito extends PagamentoBridge {

    public CartaoCredito(Imposto imposto) {
        super(imposto);
    }
    public String efetuarPagamento() {
        return "Pagto via C. Crédito "+imposto.cobrarImposto();
    }
}
