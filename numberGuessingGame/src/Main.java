import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int min=1;
        int max=100;
        int trials=10;
        int count=10;
        int a= (int) (Math.random()*(max-min+1)+min);
        Scanner sc= new Scanner(System.in);


        while(trials>0) {
            System.out.println("Guess the number between 1 to 100: ");
            number=sc.nextInt();
            if (number == a ) {
                System.out.println("Congratulations! You guessed it right at " + trials + "attempt");
                break;
            } else if (number < a){
                System.out.println("Your guess is too low. You have"+ (trials-1) + "attempts left");
                trials--;
                count--;
            }
            else{
                System.out.println("Your guess is too high. You have"+ (trials-1) + "attempts left");
                trials--;
                count--;
            }

        }

        switch (count){
            case 10:
                System.out.println("score is 10");
                break;
            case 9:
                System.out.println("score is 9");
                break;
            case 8:
                System.out.println("score is 8");
                break;
            case 7:
                System.out.println("score is 7");
                break;
            case 6 :
                System.out.println("score is 6");
                break;
            case 5:
                System.out.println("score is 5");
                break;
            case 4:
                System.out.println("score is 4");
                break;
            case 3:
                System.out.println("score is 3");
                break;
            case 2:
                System.out.println("score is 2");
                break;
            case 1:
                System.out.println("score is 1");
                break;
            default:
                System.out.println("Oops You are lost!");
        }
    }
}