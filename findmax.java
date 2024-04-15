import java.util.*;


public class findmax{
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
String input[]=sc.nextLine().split(" ");
ArrayList <Integer> list=new ArrayList<>();
int i;
for( i=0;i<input.length;i++)
{
list.add(Integer.parseInt(input[i]));

}
int max1=list.get(0);
int max2=list.get(0);
int max3=list.get(0);






for(i=0;i<list.size();i++)
{
if(list.get(i)>max1)
{

max1=list.get(i);

}


}



////////////////////
for(i=0;i<list.size();i++)
{
if(list.get(i)>max2 && list.get(i)!=max1)
{

max2=list.get(i);

}


}

////////////////////
for(i=0;i<list.size();i++)
{
if(list.get(i)>max3 && (list.get(i)!=max2   &&  list.get(i)!=max1))
{

max3=list.get(i);

}


}




System.out.print(max1+"  "+max2+"  "+max3);



}


}