import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SelmaTest extends JPanel implements ActionListener {
int frame=0;
	public static void main(String[] args) {
		JFrame window = new JFrame("Kusalta");
		window.setSize(640, 480);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		SelmaTest panel = new SelmaTest();
		window.setContentPane(panel);
		window.setVisible(true);
		Timer timer=new Timer(10,panel);
timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(50+frame, 50+frame, 50, 50);
		context(g);
	}

	public void context(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(250-frame, 50+frame, 100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		frame++;
		
	}

}
