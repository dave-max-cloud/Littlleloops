import java.util.Scanner;
public class SumOfN{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a number:");
  int number = input.nextInt();
  
  int sum = 0;
  
  for(int counter = 1; counter <= number; counter++){
  
  sum = sum + counter;
  System.out.print(counter + ",");
  }
  
  System.out.print("The sum is:" + sum);
  }
  }
