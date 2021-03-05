import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("How many gardes would you like to enter: ");
    int times = scan.nextInt();
    int sumOfGrades = 0;
    for(int i = 0; i <= times;i++) {
      System.out.println("Enter grade " + i + "->");
      int grade = scan.nextInt();
      sumOfGrades += grade;
    }
    System.out.println("The sum of the grades are::" + sumOfGrades);
  }
}