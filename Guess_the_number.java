import java.util.Scanner;
import java.util.Random;

class game{
    public int number;
    public int inputnumber;
    public int nootguesses;
    game()
    {
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserinput()
    {
        System.out.println("guesses the number ");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean iscorrectnumber()
    {
        if(inputnumber==number)
        {
            System.out.println("yes you can  guessse the number");
            return true;
        } else if (inputnumber<number) {
            System.out.println("too low............");

        } else if (inputnumber>number) {
            System.out.println("too high............");

        }
        return false;
    }
}
public class Guess_the_number {
     public static void main(String[] args) {
        game g =new game();
        boolean b=false;
        do{
            g.takeuserinput();
            b=g.iscorrectnumber();
            System.out.println(b);
        }while(!b);
    }
}