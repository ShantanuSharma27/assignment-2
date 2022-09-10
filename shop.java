import java.util.*;
public class shop
{
public static void main(String[] args)
{
int q;
double tc,tcc,tccc;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the quantity of your purchase :");
q=sc.nextInt(); 
tc=q*100;
if(tc>1000)
{
tcc=0.1*1000;
tccc=tc-tcc;
System.out.println("Congratulations your amount after discount is: "+tccc);
}
else
System.out.println("Sorry no discount on your purchase");
}
}