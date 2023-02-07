package com.greatlearning.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SkyScraper {

	public void floorsPerDay(int noOfFloors, int[] floors) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		List<Integer> sortedFloors = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < floors.length; ++i) {
			sortedFloors.add(floors[i]);
			if (floors[i] > max)
				max = floors[i];
		}
		Collections.sort(sortedFloors);
		System.out.println();

		int currentFloor = 0;

		System.out.println("The order of construction is as follows");
		for (int i = 0; i < floors.length; ++i) {
			System.out.println("Day: " + (i + 1));

			if (max == floors[i]) {
				if (i == 0) {
					System.out.println(floors[i]);
					currentFloor = floors[i];
				} else {
					System.out.print(floors[i] + " ");
					currentFloor = displayFromQueue(pq, sortedFloors, floors[i]);
					System.out.println();
				}
			} else if (floors[i] == getNextElement(currentFloor, sortedFloors)) {
				System.out.print(floors[i] + " ");
				currentFloor = displayFromQueue(pq, sortedFloors, floors[i]);
				System.out.println();
			} else {
				System.out.println();
				pq.add(floors[i]);
			}
		}
	}

	private int getNextElement(int currentFloor, List<Integer> sortedFloors) {
		if (currentFloor == 0)
			return -1;
		int nextElement = sortedFloors.indexOf(currentFloor) - 1;
		return sortedFloors.get(nextElement);
	}

	private int displayFromQueue(PriorityQueue<Integer> pq, List<Integer> sortedFloors, int floor) {
		while (1 <= pq.size() && (pq.peek() == getNextElement(floor, sortedFloors))) {
			floor = (int) pq.peek();
			System.out.print(pq.poll() + " ");
		}
		return floor;
	}
}
