
import java.util.Scanner;

public class ContaTerminal {
  final Scanner scanner = new Scanner(System.in);

  String agencyNumber;
  int accountNumber;
  String accountHolder;
  double balance;

  public void createAccount() {
    System.out.print("Por favor, digite o número da agência: ");
    this.agencyNumber = scanner.next();

    System.out.print("Por favor, digite o número da conta: ");
    this.accountNumber = scanner.nextInt();

    System.out.print("Por favor, digite o nome do titular da conta: ");
    this.accountHolder = scanner.next();

    System.out.print("Por favor, digite o saldo inicial da conta: ");
    this.balance = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        accountHolder, agencyNumber, accountNumber, balance);
  }
}
