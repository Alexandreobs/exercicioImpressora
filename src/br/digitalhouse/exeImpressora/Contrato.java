package br.digitalhouse.exeImpressora;

public class Contrato implements Imprimivel{
    private String nome;
    private String tipo;


    public Contrato (String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome do contrato: " + getNome() + "\n"
        + "Tipo de Contrato: " + getTipo() + "\n"
        + "Sou um contrato muito legal" + "\n");
    }
}
