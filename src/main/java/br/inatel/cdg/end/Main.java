package br.inatel.cdg.end;

public class Main {
    public static void main(String[] args) {

            Pessoa p = new Pessoa ("João", 01234567,4);

            Endereco end = new Endereco("Rua do cidadão","Bairro do primeiro cidadão",13);
            Endereco end1 = new Endereco("R1","B1",20);
            Endereco end2 = new Endereco("R2","B2",10);

            p.addEnd(end);
            p.addEnd(end1);
            p.addEnd(end2);

            p.mostraInfo();
        }
}

