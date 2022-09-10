import java.util.*;
public class older
{
public static void main(String[] args)
{
double a1,a2,a3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age of the first person :");
a1=sc.nextInt();
System.out.println("Enter the age of the second person :");
a2=sc.nextInt();
System.out.println("Enter thge age of the third person :");
a3=sc.nextInt();
if(a1>a2 && a1>a3 )
	System.out.println("first person is oldest and ssecond person is smallest");
else if(a2>a3 && a2>a1)
	System.out.println("second person is the oldest");
else
	System.out.println("third perosn is the oldest");
}
}


