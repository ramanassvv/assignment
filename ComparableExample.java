package collections;

import java.util.*;

public class ComparableExample implements Comparable<ComparableExample> {
			int rollno;
			String name;
			int age;		
		ComparableExample(int rollno,String name,int Age)
		{
			this.rollno=rollno;
			this.name=name;
			this.age=Age;
		}
		
	
	@Override
		public String toString() {
			return "ComparableExample [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
		}


	@Override
	public int compareTo(ComparableExample a) {
		// TODO Auto-generated method stub
		if(age == a.age)
			return 0;
		if(age > a.age)
			return 1;
		return -1;
		
	}
	public static <E> void main(String args[]){
		ArrayList<ComparableExample> s=new ArrayList<ComparableExample>();
		s.add(new ComparableExample(123,"ramana",22));
		s.add(new ComparableExample(345,"soniya",23));
		s.add(new ComparableExample(567,"madhesh",22));
		s.add(new ComparableExample(789,"raji",24));
		
		Collections.sort(s);
		
		for(ComparableExample a : s)
		{
			System.out.println(a);
		}

	}

}
