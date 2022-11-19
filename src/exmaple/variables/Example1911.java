package example.threads;

public class Example1911 {

	public static void main(String[] args) {
		// primitive data type
		byte byte_eng = 80;
		int math = 90;
		int sci = 70;
		
		
		
		//type casting
		
		// implict type casting -- done by the jvm
		int eng = byte_eng;
		
		int byte_in = 100;
		
		// explict type casting  -- should be done by the developer.
		byte int_in = (byte)byte_in; // 256
		
		

		Integer eng1 = 100; 
		String name;
		
		System.out.println(eng);
		// 0 - 2  // 3
		Integer[] marks = {eng,math,sci};
		
		Product product = new Product(1,"test","test desc");
		Product product1 = new Product(1,"test","test desc");
		
		Product[] products = {product,product1};
		
		
		System.out.println("products[0].getPid() :: "+products[0].getPname());
		
		
		// casting 
		
		Object[] objects = {product,product1,eng1};
		
		Product productObj = (Product)objects[0];
		
		System.out.println("=======> "+objects[0]);
		System.out.println("=======> "+productObj.getPname());
		
		
		
		
		// checking lenght of array
		System.out.println("marks.length :: "+marks.length);
		
		// reading value from array
		//int eng1 = marks[0];
		System.out.println(marks[0]);
		
		marks[0] = 100;
		
		System.out.println(marks[0]);
		
		
		
		
	}
	
	
}


class Product{
	
	int pid;
	String pname;
	String pdesc;

	public Product(int pid, String pname, String pdesc) {
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
	}
	
}