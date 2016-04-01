/**
 * Execução: java Fibonacci <número inteiro>
 * 
 * @author
 *
 */
public class Fibonacci {

	public static void main(String args[]) {

		try {

			int posicao = Integer.parseInt(args[0]);

			if (posicao < 1) {
				System.out
						.println("Numero inválido! Use apenas numero positivo maior que 0(zero)");
				return;
			}

			int fi = new Fibonacci().calculaFibonacci(posicao);

			System.out.println("Valor do elemento de posicao " + posicao
					+ " na sequencia Fibonacci: " + fi);

		} catch (Exception e) {
			System.out
					.println("Erro!\nExemplo: \"java Fibonacci <numero inteiro>\"");
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
