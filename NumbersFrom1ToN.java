import java.util.Scanner;
public class NumbersFrom1ToN{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a number:");
  int number = input.nextInt();
  
  for(int counter = 1; counter<= number; counter++){
    System.out.print(counter + ",");
    }
    }
    }
    
