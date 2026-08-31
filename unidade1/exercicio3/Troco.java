package unidade1.exercicio3;

public class Troco {
  public static void main(String[] args) {
    int[] cedulasDisponiveis = { 100, 50, 20, 10, 5, 2, 1 };
    int trocoPara = 125;
    int[] cedulasUsadas = new int[cedulasDisponiveis.length];

    for (int i = 0; i < cedulasDisponiveis.length; i++) {

    }
    
    System.out.println("Cédulas usadas:");
    for (int i = 0; i < cedulasDisponiveis.length; i++) {
      if (cedulasUsadas[i] > 0) {
        System.out.println("R$ " + cedulasUsadas[i] + ",00 == " + cedulasDisponiveis[i]);
      }
    }
  }
}
