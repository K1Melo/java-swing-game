package firstgamejava.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Quadrado extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public static int width = 20, height = 20;
	
	public Quadrado(int x, int y) {
		setBackground(Color.CYAN);
		setBounds(x, y, width, height);
	}	

	private void createSquare(int x, int y) {
		List<Quadrado> quadrados = new ArrayList<>();
		
		quadrados.add(new Quadrado(x, y));
	}
}
