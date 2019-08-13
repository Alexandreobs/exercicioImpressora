package br.digitalhouse.exeImpressora;

public class Documento implements Imprimivel {
    private String nome;
    private String tipo;

    public Documento(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo){
        tipo = novoTipo;
    }


    @Override
    public void imprimir() {
        System.out.println("Nome do Documento: " + getNome() + "\n"
                + "Tipo de Documento : " + getTipo() + "\n"
                + "Sou um Documento do Word" + "\n");

    }
}
