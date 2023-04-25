package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Pranay"));
		list.add(new Student(107, "Amit"));
		list.add(new Student(103, "Sneha"));
		
		Collections.sort(list);
		System.out.println(list);

	}

}
