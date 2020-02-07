package collections;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable{

		private Queue<Integer> qdata;
		private final int MAX_SIZE=3;
		
		public Producer(Queue<Integer> qdata){
			this.qdata=qdata;
		}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(qdata) {
				while (qdata.size() > 3) {
					try {
						System.out.println("Producer is waiting to consume object by consumer..");
						qdata.wait();
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				Random random = new Random();
				int data = random.nextInt(MAX_SIZE);
				qdata.add(data);
				System.out.println("Produced::"+data);
				try {
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				qdata.notify();
			}
		}
	}
	
}
