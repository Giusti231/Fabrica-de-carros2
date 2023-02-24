package visualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int solicitaOpcao() {
		
		String[] opcoes = {"Fabricar Carros","Vender carros","Ver informações dos carros","Sair" };
		
		JComboBox<String>menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static String solicitarCor() {
		
		return JOptionPane.showInputDialog(null,"Informe a cor do carro");
	}
	
	public static String solicitarModelo() {
		
		return JOptionPane.showInputDialog(null, "Informe o modelo do carro");
	}
	
	public static String solicitarInformacoes(String informacao) {
		
		JOptionPane.showMessageDialog(null, informacao, "INFORMAÇÕES", JOptionPane.INFORMATION_MESSAGE );
		
		return informacao;
	}
	
}
