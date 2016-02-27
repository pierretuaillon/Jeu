import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Affichage {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Catch Peach");
		frame.setSize(1200, 500);
		ImageIcon img = new ImageIcon("Image/peach_icon.png");
		frame.setIconImage(img.getImage());
		frame.setVisible(true);
	}

}
