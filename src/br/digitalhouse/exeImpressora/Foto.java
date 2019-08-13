package br.digitalhouse.exeImpressora;

public class Foto implements Imprimivel{
    private String nome;
    private String tipo;

    public Foto(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome do foto: " + getNome() + "\n"
                + "Tipo de foto : " + getTipo() + "\n"
                + "Sou uma selfie" + "\n");
    }
}
