package desafio;

public class Exercicio03 {
    public static void getMensagemEncriptada(String mensagem) {

        //System.out.println("Mensagem para ser encriptada : " +mensagem + "\n");

        String result = mensagem.replace(" ", "");

        //System.out.println("Removendo os espaços em branco da mensagem: " + result + "\n");

        int tamanhoMensagem = result.length();

        int raizQuadrada = (int) Math.round(Math.ceil(Math.sqrt(tamanhoMensagem)));

        //System.out.println("Definindo o tamanho do grid : " + raizQuadrada + "\n");


        char[] array = result.toCharArray();


        char[][] grid = new char[raizQuadrada][raizQuadrada];


        //System.out.println("Colocando texto dentro do array e criando a matriz com o tamanho " + raizQuadrada + " x " + raizQuadrada);

        Boolean finalAlcancado = false;
        for (int linha = 0; linha < raizQuadrada; linha++) { // percorre a matriz, linhas e colunas Até N, onde N é a raiz quadrada do tamanho da mensagem formatada
            for (int coluna = 0; coluna < raizQuadrada; coluna++) {
                int index = linha * raizQuadrada + coluna;
                if (index >= tamanhoMensagem) { // condicao de parada da matriz
                    finalAlcancado = true;
                    break;
                }
                grid[linha][coluna] = array[index]; // preenche linha n até coluna n com cada elemento do array com o texto sem espaço.
            }
            if (finalAlcancado) {
                break;
            }
        }

        String mensagemCriptografada = "";
        for (int row = 0; row < raizQuadrada; row++) {
            for (int col = 0; col < raizQuadrada; col++) {
                mensagemCriptografada = grid[col][row] + ""; // printa a mensagem encriptada ,mostrando cada linha com um espaço entre as colunas.
                System.out.println(mensagemCriptografada);
            }
            System.out.println();
        }

    }
}
