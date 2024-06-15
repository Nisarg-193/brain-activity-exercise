package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Com implements Comparable<Com>{

	private int id;
	private String name;
	private String email;
	private float height;
	
	
	public Com() {
		super();
		
	}
	
	public Com(int id,String name,String email,float height) {
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.height=height;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height=height;
	}
	
    public String toString() {
    	return id+" "+name+" "+email+" "+height;
    }
	
	
		
	

	public int compareTo(Com s1) {
		
		
		
		if(this.height==s1.height) {
			return Integer.compare(this.id, s1.id);
		}else {
			return Float.compare(this.height, s1.height);
		}
		
		
	}
}

	public class compare1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter who maney object you want to create");
		int n=sc.nextInt();
		ArrayList<Com> al=new ArrayList<Com>();
		
		
		for(int i=1;i<=n;i++) {
		Com c1=new Com();
		String input=sc.next();
		String[] arr=input.split(",");
		c1.setId(Integer.parseInt(arr[0]));
		c1.setName(arr[1]);
		c1.setEmail(arr[2]);
		c1.setHeight(Float.parseFloat(arr[3]));
		al.add(c1);
		
		}
		
		Collections.sort(al);
		System.out.println(al);

	}

}
