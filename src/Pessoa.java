public class Pessoa {

    String nome;
    String sexo;


    public Pessoa(
            String nome,
            String sexo
    ){

        this.nome = nome;
        this.sexo = sexo;

    }


    public String getSexo(){

        return sexo;

    }


    public String getNome(){

        return nome;

    }

}