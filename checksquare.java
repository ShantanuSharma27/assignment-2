import java.util.*;
public class checksquare
{
public static void main(String[] args)
{
int l,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the length and breadth");
l=sc.nextInt();
b=sc.nextInt();
if(l==b)
	System.out.println("its a square");
else
	System.out.println("its a rectangle but not a square.");
}
}
