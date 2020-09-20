package br.com.bridge;

import br.com.bridge.cor.Azul;
import br.com.bridge.forma.FormatoBridge;
import br.com.bridge.forma.Quadrado;
import br.com.bridge.formapagamento.CartaoCredito;
import br.com.bridge.imposto.Iptu;

public class BridgeApplication {

    public static void main(String[] args) {
        Iptu iptu = new Iptu();
        CartaoCredito cc = new CartaoCredito(iptu);
        System.out.println(cc.efetuarPagamento());
    }

//    public static void main(String[] args) {
//        Azul azul = new Azul();
//        Quadrado q = new Quadrado(azul);
//        System.out.println(q.desenhar());
//    }
}
