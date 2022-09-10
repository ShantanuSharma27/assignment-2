import java.util.*;
public class grades
{
public static void main(String[] args)
{
double grades;
Scanner sc = new Scanner(System.in);
System.out.println("enter the grades :");
grades=sc.nextDouble();
if(grades<25)
	System.out.println("F");
else if(grades>=25 && grades<=45)
	System.out.println("E");
else if(grades>=45 && grades <=50)
	System.out.println("D");
else if(grades>=50 && grades<=60)
	System.out.println("c");
else if(grades>=60 && grades<=80)
	System.out.println("B");
else
	System.out.println("A");
}
}
