import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerTest {
	private static class OtherTimeHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("HALO!");

		}

	}

	private static class TimerHandler implements ActionListener {
		int counter = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(counter++);

		}

	}

	public static void main(String[] args) {
		Timer t = new Timer(1000, new TimerHandler());
		Timer t2=new Timer(2000,new OtherTimeHandler());
		t2.start();
		t.start();

	}

}
