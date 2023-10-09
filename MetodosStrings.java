package treinandoMetodos;

import javax.swing.JOptionPane;

public class MetodosStrings {

	// Método para tratamento de erros
	public static String tratarErro(String frase) {

		// Caso o campo esteja vazio, cai em um campo de erro
		if (frase.isEmpty()) {

			JOptionPane.showMessageDialog(null, "O campo precisa ser preenchido, tente novamente!!");
		}

		else {

			// caso contrário converte a frase em letras minusculas
			frase = frase.toLowerCase();

			// Remove o espaço inicial e final da frase
			frase = frase.trim();

			// E retorna uma nova variavel
			String fraseRetornada = frase;

			return fraseRetornada;

		}

		return "";

	}

	public static void inverterString(String frase) {

		char caractere;

		String fraseInvertida = "";

		// Itera sobre uma frase, iniciando pelo valor da quantidade de caracteres de
		// uma frase, até chegar em 0
		for (int i = frase.length() - 1; i >= 0; i--) {

			caractere = frase.charAt(i);

			// Atribui e acrescenta em uma variavel fraseInvertida
			fraseInvertida += caractere;

		}

		String frase1 = tratarErro(frase);

		// Imprime no prompt a frase inicial e a frase invertida
		JOptionPane.showMessageDialog(null, "Frase fornecida:  " + frase1 + "\nFrase invertida:  " + fraseInvertida);

	}

	// Método que conta as vogais presentes em uma frase
	public static void contarVogais(String frase) {

		char caractere;

		int contagemVogais = 0;

		frase = tratarErro(frase);

		// Itera sobre uma frase qualquer
		for (int i = 0; i < frase.length(); i++) {

			// Atribui na variavel char os valores de cada letra da frase.
			caractere = frase.charAt(i);

			// A frase foi convertida para letras minusculas no metodo de tratamento de
			// erro, portanto não irá ocorrer um erro!
			if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {

				contagemVogais++;

			}
		}

		JOptionPane.showMessageDialog(null, "A frase fornecida:  " + frase + " contém " + contagemVogais + " vogais");

	}

	// Método que remove os espaços de uma frase fornecida
	public static void removerEspacos(String frase) {

		// Atribui o valor do retorno fornecido pelo método de tratamento de erro
		frase = tratarErro(frase);

		// Variavel sem espaço que recebe o valor da frase anterior com o método replace
		String fraseSemEspaco = frase.replace(" ", "");

		// Imprime no prompt a frase anterior e a frase modificada
		JOptionPane.showMessageDialog(null, "Frase fornecida:  " + frase + "\nFrase sem espaço:  " + fraseSemEspaco);

	}

	// Método para converter uma frase em minusculo
	public static void converterMinusculo(String frase) {

		// Atribui em uma variavel o valor retornado pelo metodo tratamento de erros
		String fraseMinusculo = tratarErro(frase);

		// Imprime no prompt as duas comparações
		JOptionPane.showMessageDialog(null,
				"Frase fornecida:  " + frase + "\nFrase convertida em minusculo:  " + fraseMinusculo);

	}

	// Método para converter uma frase em maiusculo.
	public static void converterMaiusculo(String frase) {

		// Atribui em uma variavel o valor retornado pelo metodo tratamento de erros
		frase = tratarErro(frase);

		// Atribui em uma nova variavel a frase em letras maiusculas
		String fraseMaiusculo = frase.toUpperCase();

		// Imprime no prompt as duas comparações
		JOptionPane.showMessageDialog(null,
				"Frase fornecida :  " + frase + "\nFrase convertida em maiusculo:  " + fraseMaiusculo);

	}

	// Metodo de verificação de palindromo

	public static void verificarPalindromo(String frase) {

		// Variavel vazia

		String fraseInvertida = "";
		// Variavel
		char caractere;

		// a string frase recebe o valor retornado pelo método de tratamento de erro
		frase = tratarErro(frase);

		// Itera sobre a frase e decrementa até chegar em 0
		for (int i = frase.length() - 1; i >= 0; i--) {

			caractere = frase.charAt(i);

			fraseInvertida += caractere;

		}

		// Se a frase invertida for igual a frase ela é um palíndromo
		if (fraseInvertida.equals(frase)) {

			JOptionPane.showMessageDialog(null, "Frase fornecida:  " + frase + "\nFrase invertida:  " + fraseInvertida
					+ "\nportanto é um palíndromo");
		}

		// Caso contrário não é um palíndromo
		else {

			JOptionPane.showMessageDialog(null, "Frase fornecida:  " + frase + "\nFrase invertida:  " + fraseInvertida
					+ "\nportanto não é um palíndromo");

		}

	}

	// Método de contagem de palavras em uma frase.
	public static void contarPalavras(String frase) {

		// Definição de um array com tamanho fixo de 20 palavras, uma frase com mais de
		// 20 palavras irá gerar um erro

		String[] palavras = new String[20];

		frase = tratarErro(frase);

		// O método split retorna um array, com o separador das palavras definido como "
		// ".
		palavras = frase.split(" ");

		// Caso o tamanho da frase seja superior a 20 palavras gera um erro
		if (palavras.length > 20) {

			JOptionPane.showMessageDialog(null, "Digite uma frase menor, a frase inserida é muito extensa!!");
		}

		// Caso contrário imprime a quantidade de palavras.
		else {

			JOptionPane.showMessageDialog(null, "Quantidade de palavras fornecidas na frase:  " + palavras.length);
		}
	}

	public static void contarLetras(String frase) {

		frase = tratarErro(frase);

		// Removendo os espaços entre os caracteres, para que o espaço não seja
		// contabilizado como uma letra
		frase = frase.replace(" ", "");

		JOptionPane.showMessageDialog(null, "Quantidade de letras na frase fornecida:  " + frase.length());

	}

}
