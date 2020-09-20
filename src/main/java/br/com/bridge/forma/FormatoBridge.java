package br.com.bridge.forma;

import br.com.bridge.cor.Cor;

public abstract class FormatoBridge {
    protected Cor cor;

    public FormatoBridge(Cor cor) {
        this.cor = cor;
    }

    abstract public String desenhar();
}
