import java.util.*;

public class OddSum
{
public static void main(String [] args)
{

Scanner sc=new Scanner(System.in);
int i,j,sum=0;
ArrayList<Integer> list=new ArrayList<>();
String input[]=sc.nextLine().split(" ");

for(i=0;i<input.length;i++)
{

list.add(Integer.parseInt(input[i]));



}


for(i=0;i<list.size()-1;i++)
{
sum=0;
for(j=i;j<list.size();j++)
{
System.out.print(list.get(j)+ " ");

if(list.get(j)%2!=0)

{
sum=sum+list.get(j);

}

}
System.out.println("=>"+sum);








}








}



}