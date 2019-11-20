/**
 * 
 */
package MemberApp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * @author Båmi Lee
 *
 */
public class Graphic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		class ImagePane1 extends JPanel{
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
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
			 }

	private Component exit;

			public Component getExit() {
				return exit;
			}

			public void setExit(Component exit) {
				this.exit = exit;
			}      
		        
		   
	}


