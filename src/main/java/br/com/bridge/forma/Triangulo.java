package br.com.bridge.forma;

import br.com.bridge.cor.Cor;

public class Triangulo extends FormatoBridge {

    public Triangulo(Cor cor) {
        super(cor);
    }
    public String desenhar() {
        return "Triangulo "+cor.colorir();
    }
}
