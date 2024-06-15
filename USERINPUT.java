package com.arraylist;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student3 {
	private int id;
	private String name;
	private  String email;
	private float height;
	
	
	public Student3() {
		super();
	}


	public Student3(int id, String name, String email, float height) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.height = height;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", email=" + email + ", height=" + height + "]";
	}
	

		
}
		
	
class Demo1 implements Comparator<Student3>{
	@Override
	public int compare(Student3 s1, Student3 s2) {
		Integer id1=s1.getId();
		Integer id2=s2.getId();
		return id1.compareTo(id2);
	}
}
class Demo2 implements Comparator<Student3>{
	@Override
	public int compare(Student3 s1, Student3 s2) {
		String  name1=s1.getName();
		String name2=s2.getName();
		return name1.compareTo(name2);
		}
	
	
	

}
class Demo3 implements Comparator<Student3>{
	@Override
	public int compare(Student3 s1, Student3 s2) {
		String  email1=s1.getEmail();
		String email2=s2.getEmail();
		return email1.compareTo(email2);
		}
	
	
	

}
class Demo4 implements Comparator<Student3>{
	@Override
	public int compare(Student3 s1, Student3 s2) {
		Float  height1=s1.getHeight();
		Float height2=s2.getHeight();
		return height1.compareTo(height2);
		}
	
	
	

}
class Demo5 implements Comparator<Student3>{
	@Override
	public int compare(Student3 s1, Student3 s2) {
		Integer id1=s1.getId();
		Integer id2=s2.getId();
		return -1*(id1.compareTo(id2));
		}

}
public class USERINPUT {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		Demo4 d4=new Demo4();
		Demo5 d5=new Demo5();
		TreeSet<Student3> al=null;
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Sort based on \n 1.Id, \n 2.Name, \n 3.Email, \n4.Height, \n 5.Id(highToLow)");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:al=new TreeSet<Student3>(d1);
		break;
			
			case 2:al=new TreeSet<Student3>(d2);
			break;
			
				
				
				case 3:al=new TreeSet<Student3>(d3);
				break;
					
				case 4:al=new TreeSet<Student3>(d4);
				break;
				
				case 5:al=new TreeSet<Student3>(d5);
				break;
		}
		System.err.println("Enter how maney object to be create");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			Student3 s1=new Student3();
		
			String input=sc.next();
			String[] arr=input.split(",");
			s1.setId(Integer.parseInt(arr[0]));
			s1.setName(arr[1]);
			s1.setEmail(arr[2]);
			s1.setHeight(Float.parseFloat(arr[3]));
			al.add(s1);
		}
		System.err.println(al);
		
	

	}

}
