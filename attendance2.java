import java.util.*;
public class attendance2
{
public static void main(String[] args)
{
double nca,nch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of classes you have attended :");
nca=sc.nextDouble();
System.out.println("Enter the number of classes of held :");
nch=sc.nextDouble();
System.out.println("Enter 'y' if you have any medical cause else 'N' if no :");
String med=sc.next();
double per=(nca/nch)*100;
System.out.println(per);
if(per>75 || med.equals("Y"))
	System.out.println("you are allowed to sit in the exam");
else
	System.out.println("you are not allowed to sit in the exam");
}
}