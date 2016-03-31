
/**
 * Execução: java Fibonacci <número inteiro>
 * 
 * @author
 *
 */
public class Fibonacci {

	public static void main(String args[]) {

		try {

			int fi = new Fibonacci().calculaFibonacci(new Integer(args[0]));

			System.out.println("Sequência Fibonacci para o número " + args[0]
					+ ": " + fi);

		} catch (Exception e) {
			System.out
					.println("Erro!\nExemplo: \"java Fibonacci <número inteiro>\"");
		}

	}

	/**
	 * Método para calcular Fibonacci
	 * 
	 * @param indice
	 * @return
	 */
	private int calculaFibonacci(int indice) {
		// TODO Auto-generated method stub

		if (indice == 0)
			return 0;
		else if (indice == 1)
			return 1;
		else {

			int fi = calculaFibonacci(indice - 1); // chamada recursiva
			int fi2 = calculaFibonacci(indice - 2);// chamada recursiva

			return fi + fi2;
		}

	}

}
