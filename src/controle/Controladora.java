package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Carro;
import modelo.Fabrica;
import visualizacao.EntradaSaida;

public class Controladora {

	// private Carro carro = new Carro();

	private Fabrica fabrica = new Fabrica();

	public void exibeMenu() {

		int opcoes;
		int qnt = 0;

		do {

			opcoes = EntradaSaida.solicitaOpcao();

			switch (opcoes) {

			case 0:
				qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros serão fabricados?"));

				ArrayList<Carro> listaCarroFabricado = new ArrayList<Carro>();

				for (int i = 0; i < qnt; i++) { // O objeto carro foi criado para poder acessar o metodo constroiCarro,
												// onde a cor e o modelo serão alterados no looping do for, guardando-o;

					Carro carro = new Carro();
					String cor = EntradaSaida.solicitarCor();
					String modelo = EntradaSaida.solicitarModelo();
					carro.constroiCarro(cor, modelo); // O objeto carro invoca o método constroiCarro passando os
														// argumentos (cor, modelo) guardando-os;
					this.fabrica.fabricarCarro(carro, listaCarroFabricado); // O objeto fabrica faz o contato com o
																			// método dinâmico fabricarCarro e passa
																			// como argumento (carro,
																			// listaCarroFabricado) guardando-os e
																			// deixando-os disponíveis para a classe
																			// fabrica e o método fabricarCarro;

				}

				break;

			case 1:

				Carro carroSelect = new Carro();
				carroSelect.setCor(EntradaSaida.solicitarCor());
				carroSelect.setModelo(EntradaSaida.solicitarModelo());
				this.fabrica.venderCarro(carroSelect);

				break;

			case 2:

				String informacao = this.fabrica.visualizarCarros(); // Informação recebe o método visualizarCarro da
																		// classe Fabrica,dinâmica, logo precisa do
																		// objeto fábrica para acessa-lo.
				EntradaSaida.solicitarInformacoes(informacao); // Como a classe EntradaSaida é static, ela é instanciada
																// diretamente, não precisa de um objeto para acessa-la,
																// seguida do método desejado, solicitarInformacoes que
																// leva consigo o argumento (informacao), esté guarda
																// todo o método visualizarCarros().

				break;
			}

		} while (opcoes != 3);

	}

}
