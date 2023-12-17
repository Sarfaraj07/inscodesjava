import java.util.*;
import java.io.*;
public class RSA {
public static void main(String ar[])
{
int p,q;
Scanner sc=new Scanner(System.in);
System.out.println("Prime Number");
p=sc.nextInt();
q=sc.nextInt();
int i=2;
for(i=2;i<=p-q;i++)
{
if(p%i==0)
{
System.out.println("Not a Prime Number");
break;
}
}
if(i==p)
System.out.println("Prime Number");

for(i=2;i<q-1;i++)
{
if(p%i==0)
{
System.out.println("Not a Prime Number");
break;
}
}
if(i==q)
System.out.println("prime Number");
int n=p*q;
System.out.println("Multiply "+n);
int fact=((p-1)*(q-1));
System.out.println("Factor"+fact);
System.out.println("Enter e for RSA");
int e=sc.nextInt();
while(fact%e==0)
{
e=sc.nextInt();
}
System.out.println("fact is divisible by "+e);

int d;
for(d=1;d<=fact;d++)
{
if((d*e)%fact==1)
{
System.out.println("Value of d: "+d);
break;
}
}
System.out.println("Plain Text");
double pt=sc.nextInt();
double ct=(Math.pow(pt,e)%n);
System.out.println("Cipher Text "+ct);
System.out.println("send "+ct+"to recive");
double ans=(Math.pow(ct,d));
System.out.println("PT: "+ans);
double a1=ans%n;
System.out.println("PT1: "+a1);
} 
}
