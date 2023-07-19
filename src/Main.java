import java.util.Scanner;

class PerfectSquare{
   static int i=1;
    public static boolean isPerfect(int n){

           if(i*i==n) {
               return true;
           }
        if(i*i>n) {
            return false;
        }
           else {
               i++;
               return isPerfect(n);
           }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= scanner.nextInt();
        System.out.println(isPerfect(n));
    }
}