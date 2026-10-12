import java.util.Scanner;

public class exercice3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ecrire un entier
        System.out.print("saisir un nombre entier: ");
        int n = scanner.nextInt();
        while(n > 0) {
            if (n%10==0 || n%10==1){
                n=n/10;
            }

        }
        
    }

        

    
}
