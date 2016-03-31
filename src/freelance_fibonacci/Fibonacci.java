package freelance_fibonacci;

public class Fibonacci {

	public static void main(String args[]) {

		int fi = new Fibonacci().calculaFibonacci(5);

		System.out.println(fi);

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
