package com.Code.Demo;
class Student_detail {
	void id(int id)
	{
		System.out.println("Student id is "+id);
	}

}
class Student_info extends Student_detail{
	void marksa(int marks)
	{
		System.out.println("Student marks is " +marks);
	}
}

public class Student_Main 
{  
	public static void main(String args[]) 
	{
		Student_info si = new Student_info();
		si.id(13);
		si.marksa(99);
 	}

}
