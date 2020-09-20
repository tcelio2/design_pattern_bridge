package br.com.bridge.formapagamento;

import br.com.bridge.imposto.Imposto;

public class Avista extends PagamentoBridge {

    public Avista(Imposto imposto) {
        super(imposto);
    }
    public String efetuarPagamento() {
        return "Pagto a vista: "+imposto.cobrarImposto();
    }
}
