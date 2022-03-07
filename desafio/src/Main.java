import desafio.Exercicio01;
import desafio.Exercicio02;
import desafio.Exercicio03;

import java.util.Arrays;
import java.util.List;

import static desafio.Exercicio01.getMediana;
import static desafio.Exercicio02.getNumeroElementosPares;
import static desafio.Exercicio03.getMensagemEncriptada;


public class Main {


    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("Exercicio 01 : ");
        List<Integer> listaNumeros = Arrays.asList(9, 2, 1, 4, 6);
        getMediana(listaNumeros);

        System.out.println("-----------------");

        System.out.println("Exercicio 02 : ");

        int [] array = {1, 5, 3, 4, 2};   //1, 5, 3, 4, 2
        int x = 2;

        getNumeroElementosPares(array,2);

        System.out.println("-----------------");
        System.out.println("Exercicio 03 : ");

        getMensagemEncriptada("ola mundo");

        System.out.println("-----------------");

    }
}