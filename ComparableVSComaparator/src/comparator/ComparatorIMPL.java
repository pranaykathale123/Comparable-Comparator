package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparable.Student;

public class ComparatorIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> students = new ArrayList<>();
	        Student s1 = new Student(101, "Pranay");
	        Student s2 = new Student(107, "Amit");
	        Student s4 = new Student(109, "Aman");
	        Student s3 = new Student(103, "Sneha");
	        Student s5 = new Student(103,"Revati");
	        students.add(s1);
	        students.add(s2);
	        students.add(s3);
	        students.add(s4);
	        students.add(s5);

	        Collections.sort(students, new ByIDComaparator());
	        System.out.println(students);

	}

}
