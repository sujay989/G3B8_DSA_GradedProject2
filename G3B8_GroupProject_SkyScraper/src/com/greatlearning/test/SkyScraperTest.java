package com.greatlearning.test;

import com.greatlearning.services.SkyScraper;

public class SkyScraperTest {

	public static void main(String[] args) {
		// test(3, new int[] {3,1,2});
		// test(5, new int[] {4,5,1,2,3});
		test(10, new int[] { 1, 2, 3, 8, 9, 10, 4, 5, 7, 6 });
	}

	static void test(int noOfFloors, int[] floors) {
		SkyScraper constructionOrder = new SkyScraper();
		constructionOrder.floorsPerDay(noOfFloors, floors);
	}
}
