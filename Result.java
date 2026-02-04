import java.util.Scanner;
public class Student{
	int rollNO;
	String name;
	Student(int rollNO,String name)
	{
		this.rollNO = rollNO;
		this.name = name;
	}
	void displayStudent()
	{
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+rollNO);
	}
}
class Result extends Student{
	int m1;
	 Result(int rollNo, String name, int m1) {
	        super(rollNo, name);   
	        this.m1 = m1;
	    }
	 void CalculateGrade() {
			if(m1 >= 90)
			{
				System.out.println("A");
			}
			else if(m1 >= 75)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		void display()
		{
			displayStudent();
			System.out.println("marks:"+m1);
			CalculateGrade();
		}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter Roll number:");
		int Rollno = sc.nextInt();
		System.out.println("Enter mark of python:");
		int m1 = sc.nextInt();
		Result r = new Result(Rollno, name, m1);
		r.display();
		sc.close();
	}
	

	
}
