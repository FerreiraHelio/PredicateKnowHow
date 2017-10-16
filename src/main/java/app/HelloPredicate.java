package app;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class HelloPredicate {

	private List<Integer> numbers = Arrays.asList(12,2,3,4,5,60,7,8,9,1001,1010);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloPredicate test = new HelloPredicate();
		test.ImprimeABagatela();
		
	}
	
	Predicate<Integer> isEven = new Predicate<Integer>() {

		public boolean apply(Integer arg0) {

			return arg0 % 2 ==0 ;
			
		}
		
	};
	
	Iterable<Integer> evenNumbers = Iterables.filter(numbers, isEven);
	
	public void ImprimeABagatela () {
		
		for (Integer numero : evenNumbers) {
			System.out.println(numero.toString()+" é numero par");
		}
	}

}
