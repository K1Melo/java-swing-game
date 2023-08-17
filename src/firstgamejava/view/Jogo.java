package firstgamejava.view;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jogo {
	

	public Jogo() {
		createMenu(new Tela());
	}
	
	private void createMenu(Tela gameScreen) {
		JPanel pnlMenu = new JPanel();
		pnlMenu.add(getStartButton(gameScreen));
		pnlMenu.add(getCloseButton(gameScreen));
		
		JFrame menu = new JFrame("Game Menu");
		menu.setSize(new Dimension(400, 300));
		menu.add(pnlMenu);
		menu.setVisible(true);
	}
	
	private JButton getStartButton(Tela gameScreen) {
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gameScreen.startGame();
			}
		});
		return btnStartGame;
	}
	
	private JButton getCloseButton(Tela gameScreen) {
		JButton btnStartGame = new JButton("Stop Game");
		btnStartGame.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gameScreen.stopGame();
			}
		});
		return btnStartGame;
	}
}