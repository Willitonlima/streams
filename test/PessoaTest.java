import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PessoaTest {


    @Test
    void deveRetornarSomenteMulheres(){


        List<Pessoa> pessoas =
                new ArrayList<>();



        pessoas.add(
                new Pessoa(
                        "Maria",
                        "F"
                )
        );


        pessoas.add(
                new Pessoa(
                        "Ana",
                        "F"
                )
        );


        pessoas.add(
                new Pessoa(
                        "Carlos",
                        "M"
                )
        );



        FiltroPessoa filtro =
                new FiltroPessoa();



        List<Pessoa> mulheres =

                filtro.filtrarMulheres(
                        pessoas
                );



        boolean somenteMulheres =

                mulheres.stream()

                        .allMatch(

                                p ->

                                        p.getSexo()
                                        .equalsIgnoreCase("F")

                        );



        assertTrue(
                somenteMulheres
        );

    }

}