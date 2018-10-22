package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		int colorChoice=JOptionPane.showOptionDialog(null, "Hello, what color do you want your triangle outlines?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue", "Yellow", "Magenta"}, 0);
		String polygon = JOptionPane.showInputDialog("How many triangles do you want?" );
		int x = Integer.parseInt(polygon);

		Robot r2d2 = new Robot();
		Robot.setWindowSize(x*100+ 5, 500);
		r2d2.moveTo(5, 300);
		//2. Set the speed to 100
		r2d2.setSpeed(100);
		
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			r2d2.setPenColor(255, 0, 0);
		}
		if(colorChoice == 1) {
			r2d2.setPenColor(0, 255, 0);
		}
		if(colorChoice == 2) {
			r2d2.setPenColor(0, 0, 255);
		}
		if(colorChoice == 3) {
			r2d2.setPenColor(255, 255, 0);
		}
		if(colorChoice == 4) {
			r2d2.setPenColor(255, 0, 255);
		}
		r2d2.penDown();
		for(int c = 0; c < x; c++) {
			for(int i = 0; i < 3; i++) {
			r2d2.turn(120);
			r2d2.move(100);
			}
			r2d2.moveTo(r2d2.getX()+ 100, 300);
		}
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

