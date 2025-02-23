import java.util.Scanner;

class Guess2 {

    public static void main(String args[]){

    Scanner input= new Scanner(System.in);
    int num, answer = 3;
    System.out.println("I'm thinking of a number between 1 and 10.");
    System.out.print("Can you guess it: ");
    num = input.nextInt();
    if(num == answer){
        System.out.println(".**Right**.");
    } 
    else{

        System.out.println("...Sorry, you're wrong.");
    }
    
}
}