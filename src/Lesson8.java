import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;

class ImagePane1 extends JPanel{
	
	private Image img;
	
	

	public void ImagePanel (Image img) {
	 this.img=img;// ska byta funkionen av JPanel,kan använda image utanför
	 setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
	 
	 setLayout(null);
	 
	}


    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
	}

}


public class Lesson8{
	private static Component Panel;

	public static void main (String[]args) {
		JFrame frame = new JFrame("Lesson 08");
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
	    frame.add(Panel);
	    frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}