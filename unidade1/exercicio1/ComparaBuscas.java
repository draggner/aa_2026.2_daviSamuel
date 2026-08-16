
public class ComparaBuscas {

    public static int buscaLinear(int[] vetor, int alvoBuscado) {
        return -1;
    }

    public static int buscaBinaria(int[] vetor, int alvoBuscado) {
        return -1;
    }

    public static void main(String[] args) {
        int tamanho = 1000000;
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i * 2;
        }
        int alvoBuscado = 999998;

        long inicioBuscaLinear = System.nanoTime();
        int posicaoBuscaLinear = buscaLinear(vetor, alvoBuscado);
        long tempoBuscaLinear = System.nanoTime() - inicioBuscaLinear;

        long inicioBuscaBinaria = System.nanoTime();
        int posicaoBuscaBinaria = buscaBinaria(vetor, alvoBuscado);
        long tempoBuscaBinaria = System.nanoTime() - inicioBuscaBinaria;

        System.out.printf("Linear: índice %d, tempo %d nanosegundos\n", posicaoBuscaLinear, tempoBuscaLinear);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos\n", posicaoBuscaBinaria, tempoBuscaBinaria);
    }
}