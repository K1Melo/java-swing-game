package firstgamejava.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel label, bola;
	private Painel quadrado, quadrado1, quadrado2, quadrado3, quadrado4, quadrado5, quadrado6, quadrado7
				, quadrado8, quadrado9, quadrado10, quadrado11, quadrado12, quadrado13, quadrado14
				, quadrado15, quadrado16, quadrado17, quadrado18, quadrado19, quadrado20, quadrado21
				, quadrado22, quadrado23, quadrado24, quadrado25, quadrado26, quadrado27, quadrado28
				, quadrado29, quadrado30, quadrado31, quadrado32, quadrado33, quadrado34, quadrado35
				, quadrado36, quadrado37, quadrado38, quadrado39, quadrado40, quadrado41, quadrado42
				, quadrado43;
	private int auxX = 250, auxY = 100, xDelta = 1, yDelta = 1;
	private int labelX = 220, labelY = 500;
	//line 1
	private int quadradoX = 2, quadradoY = 2, quadradoY3 = 82, quadradoX1 = 42, quadradoX2 = 82, quadradoX3 = 122
			, quadradoX4 = 162, quadradoX5 = 202, quadradoX6 = 242, quadradoX7 = 282, quadradoX8 = 322
			, quadradoX9 = 362, quadradoX10 = 402, quadradoX11 = 442, quadradoX12 = 482, quadradoX13 = 522
			, quadradoX14 = 562;
	//line 2
	private int quadradoY1 = 42, quadradoX15 = 22, quadradoX16 = 62, quadradoX17 = 102
			, quadradoX18 = 142, quadradoX19 = 182, quadradoX20 = 222, quadradoX21 = 262, quadradoX22 = 302
			, quadradoX23 = 342, quadradoX24 = 382, quadradoX25 = 422, quadradoX26 = 462, quadradoX27 = 502
			, quadradoX28 = 542;
	
	
	public void startGame() {
		new Thread() {
			public void run() {
				initScreen();
			}
		}.start();
	}
	
	public void stopGame() {
		System.exit(0);
	}
	
	private void initScreen() {
		setSize(600, 600);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(3);
				
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				switch(e.getKeyChar()) {
				
					case 'd':
						if(labelX < 485) { 
							label.setLocation(labelX += 15, labelY);
						}
						break;
					case 'a':
						if(labelX > 0) {
							label.setLocation(labelX -= 15d, labelY);
						}
						break;
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {


			}
		});
		
		//line 1
		quadrado = new Painel(quadradoX, quadradoY);
		quadrado1 = new Painel(quadradoX1, quadradoY);
		quadrado2 = new Painel(quadradoX2, quadradoY);
		quadrado3 = new Painel(quadradoX3, quadradoY);
		quadrado4 = new Painel(quadradoX4, quadradoY);
		quadrado5 = new Painel(quadradoX5, quadradoY);
		quadrado6 = new Painel(quadradoX6, quadradoY);
		quadrado7 = new Painel(quadradoX7, quadradoY);
		quadrado8 = new Painel(quadradoX8, quadradoY);
		quadrado9 = new Painel(quadradoX9, quadradoY);
		quadrado10 = new Painel(quadradoX10, quadradoY);
		quadrado11 = new Painel(quadradoX11, quadradoY);
		quadrado12 = new Painel(quadradoX12, quadradoY);
		quadrado13 = new Painel(quadradoX13, quadradoY);
		quadrado14 = new Painel(quadradoX14, quadradoY);
		
		//line 2
		quadrado15 = new Painel(quadradoX15, quadradoY1);
		quadrado16 = new Painel(quadradoX16, quadradoY1);
		quadrado17 = new Painel(quadradoX17, quadradoY1);
		quadrado18 = new Painel(quadradoX18, quadradoY1);
		quadrado19 = new Painel(quadradoX19, quadradoY1);
		quadrado20 = new Painel(quadradoX20, quadradoY1);
		quadrado21 = new Painel(quadradoX21, quadradoY1);
		quadrado22 = new Painel(quadradoX22, quadradoY1);
		quadrado23 = new Painel(quadradoX23, quadradoY1);
		quadrado24 = new Painel(quadradoX24, quadradoY1);
		quadrado25 = new Painel(quadradoX25, quadradoY1);
		quadrado26 = new Painel(quadradoX26, quadradoY1);
		quadrado27 = new Painel(quadradoX27, quadradoY1);
		quadrado28 = new Painel(quadradoX28, quadradoY1);
		
		//line 1
		quadrado29 = new Painel(quadradoX, quadradoY3);
		quadrado30 = new Painel(quadradoX1, quadradoY3);
		quadrado31 = new Painel(quadradoX2, quadradoY3);
		quadrado32 = new Painel(quadradoX3, quadradoY3);
		quadrado33 = new Painel(quadradoX4, quadradoY3);
		quadrado34 = new Painel(quadradoX5, quadradoY3);
		quadrado35 = new Painel(quadradoX6, quadradoY3);
		quadrado36 = new Painel(quadradoX7, quadradoY3);
		quadrado37 = new Painel(quadradoX8, quadradoY3);
		quadrado38 = new Painel(quadradoX9, quadradoY3);
		quadrado39 = new Painel(quadradoX10, quadradoY3);
		quadrado40 = new Painel(quadradoX11, quadradoY3);
		quadrado41 = new Painel(quadradoX12, quadradoY3);
		quadrado42 = new Painel(quadradoX13, quadradoY3);
		quadrado43 = new Painel(quadradoX14, quadradoY3);	
		
		
		label = new JLabel();
		label.setBounds(labelX,labelY, 100, 5);
		label.setBackground(Color.CYAN);
		label.setOpaque(true);
		
		
		bola = new JLabel();
		bola.setBounds(auxX,auxY, 10, 10);
		bola.setBackground(Color.CYAN);
		bola.setOpaque(true);
		add(bola);
		try {
			//line 1
			getContentPane().add(quadrado);
			getContentPane().add(quadrado1);
			getContentPane().add(quadrado2);
			getContentPane().add(quadrado3);
			getContentPane().add(quadrado4);
			getContentPane().add(quadrado5);
			getContentPane().add(quadrado6);
			getContentPane().add(quadrado7);
			getContentPane().add(quadrado8);
			getContentPane().add(quadrado9);
			getContentPane().add(quadrado10);
			getContentPane().add(quadrado11);
			getContentPane().add(quadrado12);
			getContentPane().add(quadrado13);
			getContentPane().add(quadrado14);
			//line 2
			getContentPane().add(quadrado15);
			getContentPane().add(quadrado16);
			getContentPane().add(quadrado17);
			getContentPane().add(quadrado18);
			getContentPane().add(quadrado19);
			getContentPane().add(quadrado20);
			getContentPane().add(quadrado21);
			getContentPane().add(quadrado22);
			getContentPane().add(quadrado23);
			getContentPane().add(quadrado24);
			getContentPane().add(quadrado25);
			getContentPane().add(quadrado26);
			getContentPane().add(quadrado27);
			getContentPane().add(quadrado28);
			//line 3
			getContentPane().add(quadrado29);
			getContentPane().add(quadrado30);
			getContentPane().add(quadrado31);
			getContentPane().add(quadrado32);
			getContentPane().add(quadrado33);
			getContentPane().add(quadrado34);
			getContentPane().add(quadrado35);
			getContentPane().add(quadrado36);
			getContentPane().add(quadrado37);
			getContentPane().add(quadrado38);
			getContentPane().add(quadrado39);
			getContentPane().add(quadrado40);
			getContentPane().add(quadrado41);
			getContentPane().add(quadrado42);
			getContentPane().add(quadrado43);

			add(label);
			setVisible(true);  
			bolinha();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void bolinha() throws InterruptedException {
		do {		
			auxX += xDelta;
			if(auxX > 575 || auxX < 0) {
				xDelta *= -1;
			}
			
			auxY += yDelta;
			if(auxY < 0) {
				yDelta *= -1;
				
			}else if(auxY > 550) {
				stopGame();
				quadrado.desaparecer();
				quadrado1.desaparecer();
				quadrado2.desaparecer();
				quadrado3.desaparecer();
				quadrado4.desaparecer();
				quadrado5.desaparecer();
				quadrado6.desaparecer();
				quadrado7.desaparecer();
				quadrado8.desaparecer();
				quadrado9.desaparecer();
				quadrado10.desaparecer();
				quadrado11.desaparecer();
				quadrado12.desaparecer();
				quadrado13.desaparecer();
				quadrado14.desaparecer();
				quadrado15.desaparecer();
				quadrado16.desaparecer();
				quadrado17.desaparecer();
				quadrado18.desaparecer();
				quadrado19.desaparecer();
				quadrado20.desaparecer();
				quadrado21.desaparecer();
				quadrado22.desaparecer();
				quadrado23.desaparecer();
				quadrado24.desaparecer();
				quadrado25.desaparecer();
				quadrado26.desaparecer();
				quadrado27.desaparecer();
				quadrado28.desaparecer();
				quadrado29.desaparecer();
				quadrado30.desaparecer();
				quadrado31.desaparecer();
				quadrado32.desaparecer();
				quadrado33.desaparecer();
				quadrado34.desaparecer();
				quadrado35.desaparecer();
				quadrado36.desaparecer();
				quadrado37.desaparecer();
				quadrado38.desaparecer();
				quadrado39.desaparecer();
				quadrado40.desaparecer();
				quadrado41.desaparecer();
				quadrado42.desaparecer();
				quadrado43.desaparecer();
				break;
			}
			
			for(int i = 0; i < 100; i++) {
				if(auxY == labelY - 5 && auxX == labelX + i ) {
					yDelta *= -1;
				}
			}
			if(quadrado.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX + i ) {
							yDelta *= -1;
							quadrado.desaparecer();
							remove(quadrado);
						}
					}
				}
			}

			if(quadrado1.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX1 + i ) {
							yDelta *= -1;
							quadrado1.desaparecer();
							remove(quadrado1);
						}
					}
				}
			}

			if(quadrado2.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX2 + i ) {
							yDelta *= -1;
							quadrado2.desaparecer();
							remove(quadrado2);
						}
					}
				}
			}

			if(quadrado3.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX3 + i ) {
							yDelta *= -1;
							quadrado3.desaparecer();
							remove(quadrado3);
						}
					}
				}
			}
			if(quadrado4.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX4 + i ) {
							yDelta *= -1;
							quadrado4.desaparecer();
							remove(quadrado4);
						}
					}
				}
			}

			if(quadrado5.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX5 + i ) {
							yDelta *= -1;
							quadrado5.desaparecer();
							remove(quadrado5);
						}
					}
				}
			}

			if(quadrado6.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX6 + i ) {
							yDelta *= -1;
							quadrado6.desaparecer();
							remove(quadrado6);
						}
					}
				}
			}

			if(quadrado7.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX7 + i ) {
							yDelta *= -1;
							quadrado7.desaparecer();
							remove(quadrado7);
						}
					}
				}
			}

			if(quadrado8.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX8 + i ) {
							yDelta *= -1;
							quadrado8.desaparecer();
							remove(quadrado8);
						}
					}
				}
			}

			if(quadrado9.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX9 + i ) {
							yDelta *= -1;
							quadrado9.desaparecer();
							remove(quadrado9);
						}
					}
				}
			}

			if(quadrado10.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX10 + i ) {
							yDelta *= -1;
							quadrado10.desaparecer();
							remove(quadrado10);
						}
					}
				}
			}

			if(quadrado11.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX11 + i ) {
							yDelta *= -1;
							quadrado11.desaparecer();
							remove(quadrado11);
						}
					}
				}
			}

			if(quadrado12.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX12 + i ) {
							yDelta *= -1;
							quadrado12.desaparecer();
							remove(quadrado12);
						}
					}
				}
			}

			if(quadrado13.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX13 + i ) {
							yDelta *= -1;
							quadrado13.desaparecer();
							remove(quadrado13);
						}
					}
				}
			}

			if(quadrado14.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY + j) - 2 && auxX == quadradoX14 + i ) {
							yDelta *= -1;
							quadrado14.desaparecer();
							remove(quadrado14);
						}
					}
				}
			}

			if(quadrado15.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX15 + i ) {
							yDelta *= -1;
							quadrado15.desaparecer();
							remove(quadrado15);
						}
					}
				}
			}

			if(quadrado16.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX16 + i ) {
							yDelta *= -1;
							quadrado16.desaparecer();
							remove(quadrado16);
						}
					}
				}
			}
			if(quadrado17.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX17 + i ) {
							yDelta *= -1;
							quadrado17.desaparecer();
							remove(quadrado17);
						}
					}
				}
			}

			if(quadrado18.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX18 + i ) {
							yDelta *= -1;
							quadrado18.desaparecer();
							remove(quadrado18);
						}
					}
				}
			}

			if(quadrado19.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX19 + i ) {
							yDelta *= -1;
							quadrado19.desaparecer();
							remove(quadrado19);
						}
					}
				}
			}

			if(quadrado20.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX20 + i ) {
							yDelta *= -1;
							quadrado20.desaparecer();
							remove(quadrado20);
						}
					}
				}
			}

			if(quadrado21.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX21 + i ) {
							yDelta *= -1;
							quadrado21.desaparecer();
							remove(quadrado21);
						}
					}
				}
			}

			if(quadrado22.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX22 + i ) {
							yDelta *= -1;
							quadrado22.desaparecer();
							remove(quadrado22);
						}
					}
				}
			}

			if(quadrado23.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX23 + i ) {
							yDelta *= -1;
							quadrado23.desaparecer();
							remove(quadrado23);
						}
					}
				}
			}

			if(quadrado24.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX24 + i ) {
							yDelta *= -1;
							quadrado24.desaparecer();
							remove(quadrado24);
						}
					}
				}
			}

			if(quadrado25.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX25 + i ) {
							yDelta *= -1;
							quadrado25.desaparecer();
							remove(quadrado25);
						}
					}
				}
			}

			if(quadrado26.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX26 + i ) {
							yDelta *= -1;
							quadrado26.desaparecer();
							remove(quadrado26);
						}
					}
				}
			}


			if(quadrado27.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX27 + i ) {
							yDelta *= -1;
							quadrado27.desaparecer();
							remove(quadrado27);
						}
					}
				}
			}

			if(quadrado28.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY1 + j) - 2 && auxX == quadradoX28 + i ) {
							yDelta *= -1;
							quadrado28.desaparecer();
							remove(quadrado28);
						}
					}
				}
			}

			if(quadrado29.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX + i ) {
							yDelta *= -1;
							quadrado29.desaparecer();
							remove(quadrado29);
						}
					}
				}
			}

			if(quadrado30.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX1 + i ) {
							yDelta *= -1;
							quadrado30.desaparecer();
							remove(quadrado30);
						}
					}
				}
			}

			if(quadrado31.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX2 + i ) {
							yDelta *= -1;
							quadrado31.desaparecer();
							remove(quadrado31);
						}
					}
				}
			}

			if(quadrado32.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX3 + i ) {
							yDelta *= -1;
							quadrado32.desaparecer();
							remove(quadrado32);
						}
					}
				}
			}

			if(quadrado33.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX4 + i ) {
							yDelta *= -1;
							quadrado33.desaparecer();
							remove(quadrado33);
						}
					}
				}
			}

			if(quadrado34.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX5 + i ) {
							yDelta *= -1;
							quadrado34.desaparecer();
							remove(quadrado34);
						}
					}
				}
			}
			
			if(quadrado35.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX6 + i ) {
							yDelta *= -1;
							quadrado35.desaparecer();
							remove(quadrado35);
						}
					}
				}
			}

			if(quadrado36.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX7 + i ) {
							yDelta *= -1;
							quadrado36.desaparecer();
							remove(quadrado36);
						}
					}
				}
			}

			if(quadrado37.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX8 + i ) {
							yDelta *= -1;
							quadrado37.desaparecer();
							remove(quadrado37);
						}
					}
				}
			}

			if(quadrado38.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX9 + i ) {
							yDelta *= -1;
							quadrado38.desaparecer();
							remove(quadrado38);
						}
					}
				}
			}

			if(quadrado39.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX10 + i ) {
							yDelta *= -1;
							quadrado39.desaparecer();
							remove(quadrado39);
						}
					}
				}
			}

			if(quadrado40.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX11 + i ) {
							yDelta *= -1;
							quadrado40.desaparecer();
							remove(quadrado40);
						}
					}
				}
			}

			if(quadrado41.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX12 + i ) {
							yDelta *= -1;
							quadrado41.desaparecer();
							remove(quadrado41);
						}
					}
				}
			}
			if(quadrado42.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX13 + i ) {
							yDelta *= -1;
							quadrado42.desaparecer();
							remove(quadrado42);
						}
					}
				}
			}
			if(quadrado43.isVisible()){
				for(int i = 0; i < 20; i++) {
					for(int j = 0; j < 20; j++) {
						if(auxY == (quadradoY3 + j) - 2 && auxX == quadradoX14 + i ) {
							yDelta *= -1;
							quadrado43.desaparecer();
							remove(quadrado43);
						}
					}
				}
			}
			
			bola.setLocation(auxX, auxY);
			
			Thread.sleep(5L);
		}while(getDefaultCloseOperation() == 3);
	}

}