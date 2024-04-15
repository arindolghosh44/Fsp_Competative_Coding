import java.util.*;

public class check
{

public static boolean c(String s1,String s2)
{
int i,j;

int n=s1.length();
int m=s2.length();

for(i=0;i<n;i++)
{
if(s1.charAt(i)==s2.charAt(0))
{
for(j=0;j<m;j++)
{
if(s1.charAt(i+j)!=s2.charAt(j))
{
break;

}




}


if(j==m)
return true;



}





}



return false;




}




public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

String s1=sc.nextLine();
String s2=sc.nextLine();


if(c(s1,s2))
{
System.out.println("Found !!!!");
}

else
{
System.out.println("Not Found");
}




}


}