package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		Robot rob = new Robot();
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day = JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
        
		
		
		// If it is the weekend, tell the user they get to sleep in.
		if (day.equalsIgnoreCase("Saturday")){
			JOptionPane.showMessageDialog(null, "You can sleep in");
		}
		if (day.equalsIgnoreCase("Sunday")) {
			JOptionPane.showMessageDialog(null, "You can sleep in");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get out of bed and go to school");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String percentage = JOptionPane.showInputDialog("what percent did you get in your last exam?");
		//int grade = Integer.parseInt(percentage);
int grade = Integer.parseInt(percentage);
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		if(percentage.equalsIgnoreCase("100")){
			JOptionPane.showMessageDialog(null, "you passed the exam, congratuation");
		}
		if(percentage.equalsIgnoreCase("90")){
			JOptionPane.showMessageDialog(null, "you passed the exam, congratuation");
		}
		if(percentage.equalsIgnoreCase("80")){
			JOptionPane.showMessageDialog(null, "you passed the exam, congratuation");
		}
		if(percentage.equalsIgnoreCase("70")){
			JOptionPane.showMessageDialog(null, "you passed the exam, congratuation");
		}
		else {JOptionPane.showMessageDialog(null, "Better luck next time");
			
		}
		
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is it game over");
			if (gameOver.equalsIgnoreCase("yes")){
				gameIsOver = true;}
			else {
				JOptionPane.showMessageDialog(null, "game is over");
			}
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		rob.setPenWidth(20);
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		int colorRed = Integer.parseInt(color);
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		int shapeSquare = Integer.parseInt(shape);
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if (color.equalsIgnoreCase("red"));{
			rob.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("blue"));{
			rob.setPenColor(Color.blue);
		}
		if (color.equalsIgnoreCase("yellow"));{
			rob.setPenColor(Color.yellow);
		}
		if (color.equalsIgnoreCase("black"));{
			rob.setPenColor(Color.black);
		}
		if (color.equalsIgnoreCase("pink"));{
			rob.setPenColor(Color.pink);
		}
		if (color.equalsIgnoreCase("green"));{
			rob.setPenColor(Colorgreen);
		}
	}

	
	static void drawRedSquare() {
		
		// Complete the rest of this method
	}	
	
	
}
