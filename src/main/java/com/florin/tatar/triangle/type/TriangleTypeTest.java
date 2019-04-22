package com.florin.tatar.triangle.type;

import java.util.Scanner;

public class TriangleTypeTest {
	
public static void main(String[] args) {
	double[] sides = readTriangleSides();
	TriangleTypeEnum triangleType = TriangleTypeResolver.getTriangleType(sides);
	System.out.println("The triangle is: " + triangleType);
}

public static double[] readTriangleSides() {
	double side1, side2, side3;
	try (Scanner keyboard = new Scanner(System.in)){
		System.out.print("Input the value of the first side: ");
		side1 = keyboard.nextDouble();
		System.out.print("Input the value of the second side:");
		side2 = keyboard.nextDouble();
		System.out.print("Input the value of the third side:");
		side3 = keyboard.nextDouble();
	}
	return new double[] {side1, side2, side3};
}

}
