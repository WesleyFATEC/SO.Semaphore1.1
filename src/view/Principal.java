package view;
import control.ThreadBd;
public class Principal {

	public static void main(String[] args) {
		final int numThr = 21;
		for (int i=1; i<= numThr; i++ ) {
			ThreadBd thread = new ThreadBd(i);
			thread.start();
		}
	}

}
