import java.util.*;

public class Prime
{
public static void main(String [] args)
{

Scanner sc=new Scanner(System.in);
int s,e,i,j,temp=0,sum=0;

boolean f=false;
s=sc.nextInt();
e=sc.nextInt();


for(i=s;i<=e;i++)
{
f=true;


if(i<0)
{
temp=-(i);
}
else
{
temp=i;
}
if(temp<2)
{
f=false;
}


for(j=2;j<temp;j++)
{
if(temp%j==0)
{

f=false;
break;
}

}

if(f==true)
{
System.out.print(i+" ");
sum=sum+temp;

}







}




System.out.println();
System.out.println(sum);



}



}