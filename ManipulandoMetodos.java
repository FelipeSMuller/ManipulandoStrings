package treinandoMetodos;

import javax.swing.JOptionPane;

public class ManipulandoMetodos {

	public static void main(String[] args) {

		String frase = "";

		int opcaoUsuario = 0;

		do {

			try {

				opcaoUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "MANIPULANDO STRINGS "
						+ "\n1-Inverter string " + "\n2-Contar vogais" + " \n3-Remover espaços "
						+ "\n4-Converter para minusculo "
						+ "\n5-Converter para maiusculo \n6-Verificar palíndromo \n7-Contar palavras \n8-Contar letras"));

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você inseriu dados não numéricos ou fechou o programa incorretamente!!!");

			}

			switch (opcaoUsuario) {

			case 1:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.inverterString(frase);

				break;

			case 2:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.contarVogais(frase);

				break;

			case 3:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.removerEspacos(frase);

				break;

			case 4:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.converterMinusculo(frase);

				break;

			case 5:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.converterMaiusculo(frase);

				break;

			case 6:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.verificarPalindromo(frase);

				break;

			case 7:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.contarPalavras(frase);

				break;

			case 8:

				frase = JOptionPane.showInputDialog(null, "Insira uma frase");

				MetodosStrings.contarLetras(frase);

				break;

			}

		} while (opcaoUsuario > 0);

	}

}
