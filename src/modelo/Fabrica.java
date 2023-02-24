package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fabrica {

	private ArrayList<Carro> listaCarroFabricado = new ArrayList<Carro>(); // Todos os atributos private devem possuir
																			// métodos da acesso get e set.

	public void venderCarro(Carro carroSelect) { // O argumento (Carro carroSelect) aponta para o médoto venderCarro o
													// objeto carroSelect o qual possui as informações(cor, modelo) que
													// foram ou não alteradas, guardadas na classe carro

		for (Carro carro1 : this.getListaCarroFabricado()) { // A estrutura for each aponta o que você quer (objeto
																// carro1 da classe carro) e onde ele está (:) método
																// getListaCarroFabricado() onde se tem acesso a
																// listaCarroFabricado como retorno do médoto.

			if (carro1.getCor().equals(carroSelect.getCor())) {
				if (carro1.getModelo().equals(carroSelect.getModelo())) {

					getListaCarroFabricado().remove(carro1);

					JOptionPane.showMessageDialog(null, "Vendido");
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Em falta");
				}
			}

		}
	}

	public void fabricarCarro(Carro carro, ArrayList<Carro> listaCarroFabricado) {

		setListaCarroFabricado(listaCarroFabricado);

		listaCarroFabricado.add(carro);

	}

	public String visualizarCarros() {

		String informacaoF = "Lista de carros fabricados: \n";

		int a = 0;
		int i = 0;

		for (Carro carro : this.getListaCarroFabricado()) {
			a = i;
			i = a + 1;

			String msg = "Informações do " + (i) + "° carro: \n\n";

			informacaoF += msg + "Cor do carro: " + carro.getCor() + "\n Modelo do carro: " + carro.getModelo()
					+ "\n\n ";

			a += i;

		}

		informacaoF += "Números de carros em estoque: " + i + "\n";

		return informacaoF;
	}

	public ArrayList<Carro> getListaCarroFabricado() {
		return listaCarroFabricado;
	} // O método getArrayList foi criado para quem o acessar obter o retorno da
		// listaCarroFabricado.

	public void setListaCarroFabricado(ArrayList<Carro> listaCarroFabricado) {
		this.listaCarroFabricado = listaCarroFabricado;
	} // O método SetArrayList foi criado para fazer a substituição, alterar, a
		// listaCarroFabricado.

}
