package assignment4;

import java.util.Scanner;

public class Student 
{
String name;
int marks;
public void acceptRecord()
{
try (Scanner sc = new Scanner (System.in)) 
{
	System.out.print("Enter name: ");
	this.name = sc.nextLine();
	System.out.print("Enter marks: ");
	this.marks = sc.nextInt();
}
}
public void printRecord()
{
System.out.println(this.name+ " " +this.marks);
}
public static void main(String[] args)
{
	Student stu = new Student();
	stu.acceptRecord();
	stu.printRecord();
}
	
}
