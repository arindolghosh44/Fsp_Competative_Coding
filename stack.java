import java.util.*;

 class stackop{

int top,size;
int arr[]=new int [100];
stackop()
{
top=-1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size:");
size=sc.nextInt();


}

 public void push(int val)
{

if(top==size-1)
{
System.out.println("overflow");
}


arr[++top]=val;



}

  public int pop()
{
if(top==-1)
return -404;

int temp=arr[top];
top--;
return temp;

}

  public int peek()
{
return this.arr[this.top];


}

  public boolean isempty()
{

if(top==-1)
return true;

else
return false;
}





  public void show()
{
for(int i=0;i<=top;i++)
System.out.print(arr[i]+" ");


}







}
























public class stack{
public static void main(String [] args){


stackop s=new stackop();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("");
System.out.println("1. push");
System.out.println(" 2.pop");
System.out.println("3. show");
System.out.println("4. isempty");
System.out.println("5. peek");
System.out.println("0.Exist");

System.out.println("Enter choice: ");
int ch=sc.nextInt();

if(ch==0)
{
break;
}

else
{
if(ch==1)
{
System.out.println("Enter values:");
int val=sc.nextInt();
s.push(val);



}

if(ch==2)
{
int j=s.pop();
if(j==-404)
System.out.println("empty");
else
System.out.println(j);





}

if(ch==3)
{
s.show();



}

if(ch==4)
{

System.out.println("empty:"+" "+s.isempty());



}

if(ch==5)

{

System.out.println("peek:"+" "+s.peek());



}







}











}




























}


}