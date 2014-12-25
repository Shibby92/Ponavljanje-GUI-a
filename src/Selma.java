import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Selma extends JPanel implements ActionListener{
	int frame=0;
	public static void main(String[] args) {
		JFrame window = new JFrame("Prozorcic");
		window.setSize(500, 500);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setResizable(false);
		Selma panel = new Selma();
		window.setContentPane(panel);
		window.setVisible(true);
		Timer timer= new Timer(100,panel);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillOval(50+frame, 50+frame, 50, 50);
		context(g);
	}

	public void context(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

	
}
