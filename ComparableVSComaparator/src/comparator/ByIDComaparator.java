package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Student;

class ByIDComaparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getId()==s2.getId()) {
			return s1.getName().compareTo(s2.getName());
		}else if(s1.getId()>s2.getId()) {
			return 1;
		}else {
			return -1;
		}
	}
	
   
}
