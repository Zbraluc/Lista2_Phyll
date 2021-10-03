package br.inatel.cdg.end;

public class Pessoa {

    private String nome;
    private int cpf;
    private Endereco[] endereco;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void addEnd(Endereco end ){
        for(int i = 0; i < endereco.length; i++){
            if(endereco[i] == null){
                this.endereco[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("");

        for (int i = 0; i<endereco.length; i++){
            if (endereco[i] != null) {
                System.out.println("Rua: " + endereco[i].getRua());
                System.out.println("Numero da casa: " + endereco[i].getNum());
                System.out.println("Bairro: " + endereco[i].getBairro());
                System.out.println("");
            }
        }
    }
}
