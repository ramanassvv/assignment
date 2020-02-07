package collections;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Prodcons{
	public static void main(String args[]){
		Queue<Integer> qdata=new LinkedList<>();
		 
		Producer producer1 = new Producer(qdata);
		Producer producer2 = new Producer(qdata);
		Consumer consumer = new Consumer(qdata);
		
		Thread producer1Thread = new Thread(producer1);
		Thread producer2Thread = new Thread(producer2);
		Thread consumerThread = new Thread(consumer);
		
		producer1Thread.start();
		producer2Thread.start();
		consumerThread.start();
	}
}