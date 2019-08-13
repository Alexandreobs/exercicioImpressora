package br.digitalhouse.exeImpressora;

import java.util.ArrayList;
import java.util.List;

public abstract class Impressora {

    private List <Imprimivel> imprimiveis = new ArrayList<>();

    public void adicionarIprimivel (Imprimivel novoImprimivel){
        imprimiveis.add(novoImprimivel);
        }

        public void imprimirTudo(){
            for(int i = 0; i < imprimiveis.size(); i++) {
                System.out.println(imprimiveis.get(i));
            }

    }
}
