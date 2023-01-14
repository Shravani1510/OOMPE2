package secondAssignment;

import peasy.*;

import java.awt.*;
import java.util.Scanner;
import secondAssignment.ControlFlowPopulation;

import processing.core.PApplet;

public class CellAutomatPrototype extends PApplet {

	PeasyCam camera;
	Rectangle rectangle;

	private ControlFlowPopulation controlFlow;

	public static void main(String[] args) {
		PApplet.main("secondAssignment.CellularAutomatPrototype");
	}

	public void settings() {
		size(800, 800, P3D);

		this.controlFlow = new ControlFlowPopulation(40, 40);

		// Cells for the first pattern

				controlFlow.setAlive(19, 20);
				controlFlow.setAlive(20, 20);
				controlFlow.setAlive(19, 19);
				controlFlow.setAlive(20, 19);

		// Cells for the second pattern
		//	
//					 controlFlow.setAlive(18, 21);
//					 controlFlow.setAlive(18, 19);
//					 controlFlow.setAlive(19, 22);
//					 controlFlow.setAlive(20, 22);
//					 controlFlow.setAlive(21, 22);
//					 controlFlow.setAlive(22, 22);
//					 controlFlow.setAlive(22, 21);
//					 controlFlow.setAlive(22, 20);
//					 controlFlow.setAlive(21, 19);

		// Cells for the third pattern

//		controlFlow.setAlive(19, 22);
//		controlFlow.setAlive(20, 22);
//		controlFlow.setAlive(21, 22);
//		controlFlow.setAlive(19, 23);
//		controlFlow.setAlive(20, 24);
//		controlFlow.setAlive(19, 18);
//		controlFlow.setAlive(18, 18);
//		controlFlow.setAlive(18, 17);
//		controlFlow.setAlive(19, 17);

		int k = inputGenerationsFromUser();
		controlFlow.flow(k);

	}

	// Checking  each step of the generations with mouse clicks
	public void onMouseClick() {
		controlFlow.flow(2);
	}

	int rows = 10;
	int columns = 10;
	int[][] grid;

	public void setup() {
		camera = new PeasyCam(this, 80, -80, -30, 180);
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				rectangle = new Rectangle(i, j, 40, 40);
			}
		}
	}

	public int inputGenerationsFromUser() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value, 1 or 5 or 10 or 20 or 50 for generations: ");
		int value = scanner.nextInt();
		scanner.close();
		return value;
	}

	public void draw() {

		background(256);

		for (int x = 0; x < this.controlFlow.meshWidth; x++) {
			for (int y = 0; y < this.controlFlow.meshHeight; y++) {
				if (this.controlFlow.getCellState(x, y) == 1) {
					rectangle = new Rectangle(x * 4, y * 4, 4, 4);
					rectangle.draw( color(135, 206, 235),this);
				} else {
					rectangle = new Rectangle(x * 4, y * 4, 4, 4);
					rectangle.draw( color(255, 255, 224),this);

				}
			}

		}
	}
}
