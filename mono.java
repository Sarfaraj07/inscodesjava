import java.util.*;

public class mono
{
public static void main(String args[])
{
final char alpha[]={'a','b','c','d','e','f','g','h','i','j','k','l','n','m','o','p','q','r','s','t','u','v','w','x','y','z'};
final char alpha1[]={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};

Scanner s=new Scanner(System.in);
String pltext;
char ctext[]=new char[20];
char dtext[]=new char[20];

int i,l;

System.out.println("Plain Text: \n");
pltext=s.nextLine();
pltext=pltext.toLowerCase();
l=pltext.length();
for(i=0;i<l;i++)
{
for(int j=0;j<26;j++)
{
if(alpha[j]==pltext.charAt(i))
{
ctext[i]=alpha1[j];
break;
}
}
}
System.out.println("Cipher Text :");

for(i=0;i<l;i++)
{
System.out.println(ctext[i]);
}
String b=new String(ctext);

for(i=0;i<l;i++)
{
for(int j=0;j<26;j++)
{
if(alpha1[j]==b.charAt(i))
{
dtext[i]=alpha[j];
break;
}
}
}
System.out.println("Plain Text");
for(i=0;i<l;i++)
{
System.out.println(dtext[i]);
}
}
}

