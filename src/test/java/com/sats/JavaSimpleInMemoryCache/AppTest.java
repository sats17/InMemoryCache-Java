package com.sats.JavaSimpleInMemoryCache;

import java.util.Scanner;

import com.sats.main.CacheController;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running started");
		Scanner sc = new Scanner(System.in);
		int val = Integer.parseInt(sc.nextLine());
		CacheController controller2 = new CacheController(val,10000);
		CacheController controller = new CacheController(val,10000);
		controller.setCache("first", "1");
		controller.setCache("second", "1");
		controller.setCache("third", "1");
		controller.setCache("four", "1");
		controller.setCache("five", "1");
		controller2.setCache("first", "1");
		System.out.println(controller2.getAll());
		controller2.setCache("second", "2");
		System.out.println(controller2.getAll());
		controller2.setCache("third", "3");
		System.out.println(controller2.getAll());
		controller2.setCache("Four", "4");
		System.out.println(controller2.getAll());
		controller2.setCache("Five", "4");
		Thread.sleep(1);
		System.out.println(controller2.getAll());
		System.out.println(controller.getAll());
	}

}
