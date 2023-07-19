import java.util.Scanner;
public class perfectNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;
        int total=0;

        System.out.println("Bir Sayı Giriniz: ");
        number= input.nextInt();

        for (int i =1; i<number ;i++){

            if(number % i == 0){

                total+=i;
                System.out.println(total);
            }
        }
        if(total==number){

            System.out.println("Sayı mükemmel sayıdır");
        }
        else {

            System.out.println("Sayı mükemmel sayı değildir");
        }
        
    }
}