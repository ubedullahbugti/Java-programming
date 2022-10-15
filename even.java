import java.util.Scanner;
class even{
public static void main(String[] org)
{
int num;
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to check weather it is even or odd");
num=obj.nextInt();
if(num%2==0){
System.out.println("Number is even ");
}
else{
System.out.println("Number is odd ");
}
}
}

