import java.io.*;
public class  vernam{

public static int grtCharValue (char x){

int y=(int)'a';
return(int)(x-y);

}

public static char getNumberValue(int x)
{
int z=x+(int)'a';
return(char)z;
}

public static void main(String as[])throws Exception{

BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

System.out.println("Enter Your Plain Text");
String accept = br.readLine();

System.out.println("Enter Your One time Pad");
String pad = br.readLine();

int aval[]=new int [accept.length()];
int pval[]=new int [pad.length()];
int initval[]=new int [pad.length()];


if(pad.length()!=accept.length())
{
System.out.println("Invalid One-Time pad application Terminate");
return;

}
for(int i=0;i<accept.length();i++)
{
int k =getCharValue(accept.charAt(i));
aval[i]=k;

}




for(int i=0;i<pad.length();i++)
{
int k =getCharValue(pad.charAt(i));
pval[i]=k;
}


for(int i=0; i<pad.length();i++)
{
initval[i]=aval[i]+pval[i];
if(initval[i]>25)
initval[i]=initval[i]%26;

}

System.out.println("Cipher Text is :");

String cipher="";

for(int i=0;i<pad.length();i++)
{
cipher+=getNumberValue(initval[i]);
}

}
}