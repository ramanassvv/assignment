package collections;

import java.util.*;

public class ComparatorExample implements Comparator<ComparatorExample> {
	
	int salary;
	String name;
	int age;

	ComparatorExample(int salary,String name,int Age)
	{
		this.salary=salary;
		this.name=name;
		this.age=Age;
	}
	
	ComparatorExample(){}
	
	@Override
	public String toString() {
		return "ExComparator [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	


	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		
		if(o1.age == o2.age)
			return 0;
		if(o1.age > o2.age)
			return 1;
		
		return -1;
	}
	
	public static <E> void main(String args[]){
		ArrayList<ComparatorExample> s=new ArrayList<ComparatorExample>();
		s.add(new ComparatorExample(123,"ramana",22));
		s.add(new ComparatorExample(345,"soniya",23));
		s.add(new ComparatorExample(567,"madhesh",22));
		s.add(new ComparatorExample(789,"raji",24));
		
		Collections.sort(s, new ComparatorExample());
		System.out.println("Comaparing by age:");
		for(ComparatorExample a : s)
		{
			System.out.println(a);
		}
		System.out.println("Comaparing by name:");
		Collections.sort(s,new NameComparator());
		for(ComparatorExample b : s)
		{
			System.out.println(b);
		}
		
		System.out.println("comapring to salry");
		Collections.sort(s,new SalaryComparator());
		for(ComparatorExample c:s){
			
			System.out.println(c);
			
		}
	}
}
