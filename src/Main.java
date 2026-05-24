import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner entrada =
                new Scanner(System.in);


        List<Pessoa> pessoas =
                new ArrayList<>();



        System.out.println(
        "Digite 4 nomes e o sexo:"
        );

        System.out.println(
        "Ex: Maria,F"
        );



        for(int i=0;i<4;i++){

            String dado =
                    entrada.nextLine();


            String[] separado =
                    dado.split(",");



            pessoas.add(

                    new Pessoa(

                            separado[0],
                            separado[1]

                    )

            );

        }



        List<Pessoa> mulheres =

                pessoas.stream()

                        .filter(

                                p ->
                                        p.getSexo()
                                        .equalsIgnoreCase("F")

                        )

                        .collect(
                                Collectors.toList()
                        );



        System.out.println(
        "\nLista mulheres:"
        );



        mulheres.forEach(

                mulher ->

                        System.out.println(
                                mulher.getNome()
                        )

        );



        entrada.close();

    }

}