package myarraylist;

public class MyArrayList {

	public static void main(String[] args) {
		
		 MyArrayList1 m1 = new   MyArrayList1();
		 
		 
		 m1.add(10);
		 m1.add(20);
		 m1.add("SUPRITH");
		 
		 MyArrayList1 m2 = new   MyArrayList1();
		 
		 m2.add(40);
		 m2.add(50);
		 m2.add("SUPRITH");
		 
		 m2.add(3, 60);
		 
		 
		 MyArrayList1 m4 = new   MyArrayList1();
		 m4.add(70);
		 m4.add(80);
		 m4.add("PRAMOD");
		 System.out.println(m4);
         MyArrayList1 m3 = new   MyArrayList1();
		 m3.addAll(1, m2);
		 
		 System.out.println(m3);
	}
}
