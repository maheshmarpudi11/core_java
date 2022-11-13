package demo;

public class variable {
	//global variable - can be used in any method. static variable are constants and non static varibles are object values
	static float classduration = 2.30f; //double, float
	static boolean status = true;
	int pay1 =2000;
	
	//pojo, entity, bean
//	d1 d1;
	
	public static void print6()
	{
	d1 d11= new d1();
	//d11.setName('A');
//	d11.setMarks(50);
	System.out.println("---------pojo-------------------------");
	System.out.println(d11);
	System.out.println(d11.getMarks());
	
	System.out.println(d11.getName());
	d1 dyy = new d1();
	//dyy.setMarks(50); //overriding
	System.out.println("---------new pojo-------------------------");
	System.out.println(dyy);
	System.out.println(dyy.getMarks());
	System.out.println(dyy.getName());
	
	d1  dzz = new d1(100,'S');
	System.out.println("---------generate fields object-------------------------");
	System.out.println(dzz);
	System.out.println(dzz.getName());
	System.out.println(d1.getCollegename());
	}

	//main class
	public static void main (String [] args) {
		//local variable
		String name = "SS"; //multiple characters 
		char gender = 'F'; //single character
		int pay = 1000; //byte, short, int, long
		float classduration = 3.30f; //double, float
		boolean status = true;
		
		System.out.println(name +" "+ pay + status);
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Pay: " + pay);
		System.out.println("Class duration: " + classduration);
		System.out.println("Status: " + status);
		
		/*double 
		 * line comment
		 */
	print(classduration); //static method calling another static method does not require object
	
	variable obj = new variable(); 
	obj.print1(classduration);
	
	print3();
	
	//variable.obj = new variable();
	obj.print4();

	int pay2 = obj.print5();
	System.out.println("Pay2: " + pay2);
	
	print6();
	}
	
	
	public static void print(double classduration)
	{
	System.out.println("----------------------------------");
	System.out.println("Class duration: " + classduration);
	System.out.println("Status: " + status);
	}
	
	//non static method calling another nonstatic method does not require obj

	
	public void print1(double classduration)
	{
	System.out.println("Print 1 Non Static Method----------------------------------");
	System.out.println("Class duration: " + classduration);
	System.out.println("Status: " + status);
	print2();
	}
	
	public void print2()
	{
	System.out.println("Print 2 Non Static Method----------------------------------");
	System.out.println("Class duration: " + classduration);
	System.out.println("Status: " + status);
	}
	
	public static void print3()
	{
	System.out.println("Print 3 Non Static Method----------------------------------");
	System.out.println("Class duration: " + classduration);
	System.out.println("Status: " + status);
	}

	void print4()
	{
		System.out.println("Print 4 Non Static Method----------------------------------");
		System.out.println("Class duration: " + classduration);
		System.out.println("Status: " + status);
		}
		
	int print5()
	{
		System.out.println("Print 5 Non Static Method----------------------------------");
		System.out.println("Class duration: " + classduration);
		System.out.println("Status: " + status);
		return pay1=3000;
		}
	}

