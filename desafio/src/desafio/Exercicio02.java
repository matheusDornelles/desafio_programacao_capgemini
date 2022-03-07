package desafio;

public class Exercicio02 {
    public static void getNumeroElementosPares(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    int diferenca = (array[i]) - (array[j]); // seta diferenca
                    if (diferenca < 0) {
                        diferenca = diferenca * (-1); // se difenca for negativa, transforma em positiva
                    }
                    if (diferenca == x) {
                        count++; // incrementa cada vez que o x for igual a um par que tenha diferença entre eles do valor de x

                        //System.out.println("Elementos : " + array[i] + "," + array[j] + " com diferenca de " + x);
                    }
                }
            }
        }
        System.out.println(count);
    }
}