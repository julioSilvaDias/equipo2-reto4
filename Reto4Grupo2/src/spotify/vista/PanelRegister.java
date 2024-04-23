package spotify.vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelRegister {
	private JPanel panel = null;
	private JButton jButtonPanel = null;

	public PanelRegister(ArrayList<JPanel> paneles) {
		panel = new JPanel();
		panel.setBounds(26, 21, 356, 156);
		panel.setBackground(Color.green);

		jButtonPanel = new JButton("Panel 1");
		jButtonPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);

				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(true);
			}
		});
		jButtonPanel.setBounds(60, 60, 89, 23);
		panel.add(jButtonPanel);

		panel.setLayout(null);
	}

	public JPanel getPanel() {
		return panel;
	}
}
