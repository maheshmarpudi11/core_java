package demo;

public class d1 {
	private int marks;
	private char name;
	public static final String CollegeName = "Facebook";

	
	
	public static String getCollegename() {
		return CollegeName;
	}


	public d1() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("D1 object is created");
		//marks=45;
		
	}
	
	
	public d1(int marks, char name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}
/*	public void setMarks(int marks) {
		this.marks = marks;
	}*/
	public char getName() {
		return name;
	}
	/*public void setName(char name) {
		this.name = name;
	}*/
	
	@Override
	public String toString() {
		return "d1 [marks=" + marks + "]";
	}
	
	
}
