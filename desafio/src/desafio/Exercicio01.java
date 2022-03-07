package desafio;

import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    public static void getMediana(List<Integer> listaNumeros) {

        // Oderna lista de numeros
        Collections.sort(listaNumeros);

        // divide lista por 2 para achar a mediana
        int tamanhoLista = listaNumeros.size() / 2;

        //printa a lista

        System.out.println(listaNumeros.get(tamanhoLista));

    }
}

