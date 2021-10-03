package br.inatel.cdg.end;

public class Endereco {

    private String rua;
    private String bairro;
    private int num;

    public Endereco(String rua, String bairro, int num){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }


    public void setRua(String rua) {
        this.num = num;
    }

    public String getRua() {
        return rua;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
