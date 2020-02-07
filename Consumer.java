package collections;

import java.util.Queue;

public class Consumer implements Runnable {

	private Queue<Integer>qdata;
	private final int MAX_SIZE=0;

	public Consumer(Queue<Integer> qdata) {
		this.qdata = qdata;
	}

	public void run() {
		
		while (true) {
			synchronized(qdata) {
				while (qdata.size() == 0 ) {
					try {
						System.out.println("Consumer is waiting to produce objects by Producer..");
						qdata.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				int data = qdata.poll();
				System.out.println("Consumed::"+data);
				qdata.notify();
			}
		}

	}

}
