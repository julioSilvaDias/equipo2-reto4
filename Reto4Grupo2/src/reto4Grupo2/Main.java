package reto4Grupo2;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import reto4Grupo2.vista.PanelBienvenida;
import reto4Grupo2.vista.PanelLogin;
import reto4Grupo2.vista.PanelRegister;

public class Main {

	private JFrame frame;
	private ArrayList <JPanel> paneles = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	  /**
	 * Create the frame.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		// Lista que contiene los paneles
		paneles = new ArrayList <JPanel> ();
		
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelBienvenida panelBienvenida = new PanelBienvenida(paneles);
		JPanel panel1 = panelBienvenida.getPanel();
		panel1.setVisible(true);
		
		// Lo metemos en la lista y en la ventana
		paneles.add(panel1);
		frame.getContentPane().add(panel1);
		
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelLogin panelLogin = new PanelLogin(paneles);
		JPanel panel2 = panelLogin.getPanel();
		panel2.setVisible(false);
		
		// Lo metemos en la lista y en la ventana
		paneles.add(panel2);
		frame.getContentPane().add(panel2);
		
		// Creamos los gestores y los paneles. Pasamos la lista por el constructor
		PanelRegister panelRegister = new PanelRegister(paneles);
		JPanel panel3 = panelRegister.getPanel();
		panel3.setVisible(false);
		
		// Lo metemos en la lista y en la ventana
		paneles.add(panel3);
		frame.getContentPane().add(panel3);
	}

}
