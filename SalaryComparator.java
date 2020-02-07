package collections;

import java.util.Comparator;

public class SalaryComparator  implements Comparator<ComparatorExample>  {

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		// TODO Auto-generated method stub
		if(o1.salary == o2.salary)
			return 0;
		if(o1.salary > o2.salary)
			return 1;
		
		return -1;
	}

}
