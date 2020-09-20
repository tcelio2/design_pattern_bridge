package br.com.bridge.formapagamento;

import br.com.bridge.imposto.Imposto;

public abstract class PagamentoBridge {
    protected Imposto imposto;

    public PagamentoBridge(Imposto imposto) {
        this.imposto = imposto;
    }

    public abstract String efetuarPagamento();
}
