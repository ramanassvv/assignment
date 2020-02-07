package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorExample> {

	@Override
	public int compare(ComparatorExample s1, ComparatorExample s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	

}
