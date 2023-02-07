package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.services.SkyScraper;

public class Main {

	public static void main(String[] args) {
		SkyScraper constructionOrder = new SkyScraper();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		try {
			int noOfFloors = sc.nextInt();
			if (noOfFloors <= 0) {
				System.out.println("Invalid count of floors in the building");
			} else {
				int[] floors = new int[noOfFloors];

				for (int i = 0; i < noOfFloors; ++i) {
					System.out.println("enter the floor size given on day : " + (i + 1));
					floors[i] = sc.nextInt();
				}

				constructionOrder.floorsPerDay(noOfFloors, floors);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
