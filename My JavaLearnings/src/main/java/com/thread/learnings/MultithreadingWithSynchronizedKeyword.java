package com.thread.learnings;

/**
 * The synchronization is mainly used to 1) To prevent thread interference. 2)
 * To prevent consistency problem.
 * 
 */

class SynchdCounter {
	int count;

	synchronized void increment() {// method not synchronized
		count++;
	}
}

class MySynchedThread extends Thread {
	SynchdCounter t;

	MySynchedThread(SynchdCounter t) {
		this.t = t;
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			t.increment();
		}
	}

}

public class MultithreadingWithSynchronizedKeyword {
	public static void main(String args[]) throws Exception {
		SynchdCounter counter = new SynchdCounter();// only one object
		MySynchedThread t1 = new MySynchedThread(counter);
		MySynchedThread t2 = new MySynchedThread(counter);
		MySynchedThread t3 = new MySynchedThread(counter);
		MySynchedThread t4 = new MySynchedThread(counter);
		MySynchedThread t5 = new MySynchedThread(counter);
		MySynchedThread t6 = new MySynchedThread(counter);
		MySynchedThread t7 = new MySynchedThread(counter);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();

		System.out.println(counter.count);
	}
}
