import java.util.Scanner;
class student
{
private String name;
private int rollno;
private double marks;
student()
{
	System.out.println("constructor is called");
	name="heena";
	rollno=12;
	marks=90.8;
}
student(String name,int rollno,double marks)
{
	System.out.println("parameterized constructor is called");
	this.name=name;
	this.rollno=rollno;
	this.marks=marks;
}
public void display()
{
System.out.println("name of student is "+this.name);
System.out.println("rollno of student is "+this.rollno);
System.out.println("marks of student is "+marks);
}
}
class demo
{
	public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	student s=new student();
	System.out.println("enter the name");
	String name=sc.nextLine();
	System.out.println("enter the rollno");
	int rollno=sc.nextInt();
	System.out.println("enter the marks");
	double marks=sc.nextDouble();
	student s1=new student(name,rollno,marks);
	//s.setdata();
	s.display();
	s1.display();
}
}