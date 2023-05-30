import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            {
                double saldo = 1000.00;

                System.out.println("Por favor indique sua agência sem o dígito");
                int agencia = scanner.nextInt();
                
                       
                System.out.println("Por favor indique sua conta sem o dígito");
                int conta = scanner.nextInt();
                    
                System.out.println("Por favor indique seu primeiro nome");
                String nome = scanner.next();
            
                System.out.println("Por favor indique seu sobrenome");
                String sobrenome = scanner.next();
                     
            
                System.out.println("Olá, " + nome + " " + sobrenome + ". Tudo Bem?! Obrigado por ser nosso cliente! Sua Agência é " + agencia + " , sua conta é " + conta + " e o seu saldo no valor de R$" + saldo + " está disponível.");

            }
        }
    
    }
}  
            
       
    

