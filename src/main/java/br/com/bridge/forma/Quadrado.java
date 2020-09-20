package br.com.bridge.forma;

import br.com.bridge.cor.Cor;

public class Quadrado extends FormatoBridge {

    public Quadrado(Cor cor) {
        super(cor);
    }
    public String desenhar() {
        return "Quadrado "+cor.colorir();
    }
}


