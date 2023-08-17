package firstgamejava.view;

import java.awt.Color;

   import javax.swing.JPanel;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Painel(int x, int y) {
		setBackground(Color.GRAY);
		setBounds(x, y, 20, 20);
	}	
	
	public void desaparecer() {
		setVisible(false);
	}
}