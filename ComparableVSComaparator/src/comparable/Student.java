package comparable;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(id==o.id) {
			return 0;
		}else if(id>o.id) {
				return 1;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
