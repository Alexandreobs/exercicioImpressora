package br.digitalhouse.exeImpressora;

public class Principal {
    public static void main(String[] args) {

        Contrato contratoLuciana = new Contrato("Contrato de compra Luciana", "venda");
        contratoLuciana.imprimir();

        Foto fotoCoelho = new Foto("Passeio zoologico","JPG");
        fotoCoelho.imprimir();

        Documento docjessica = new Documento("Alunos aprovados","lista");
        docjessica.imprimir();


    }
}
