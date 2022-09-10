import java.util.*;
public class salary
{
public static void main(String[] args)
{
double sal,years;
double nsal,nnsal;
Scanner sc= new Scanner(System.in);
System.out.println("enter the salary :");
sal=sc.nextInt();
System.out.println("enter the years you have worked :");
years=sc.nextInt();
if(years>=5.0)
{
nsal=0.5*sal;
nnsal=sal+nsal;
System.out.println("salary after bonus :"+nnsal);
}
else
System.out.println("no bonus :"+sal);
}
}

