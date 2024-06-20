
class Main {
  public static void main(String[] args) {

    
    System.out.println("\nOperação conta corrente:");
    Corrente corrente1 = new Corrente(123, "N123", 600F);
    Banco banco1 = new Banco(321, "Maria", corrente1);
    banco1.exibirContas();
    corrente1.realizaSaque(5000);
    corrente1.realizaDeposito(50); 
    banco1.exibirContas();

    System.out.println("\nOperação conta corrente:");
    Corrente corrente2 = new Corrente(102, "N102", 400F);
    Banco banco3 = new Banco(102, "José", corrente2);
    banco3.exibirContas();
    corrente2.realizaSaque(50);
    banco3.exibirContas();

    System.out.println("\nOperação conta poupança:"); 
    Poupanca poupanca1 = new Poupanca(456, "N456", 500F);
    Banco banco2 = new Banco(654, "Lua", poupanca1);
    banco2.exibirContas();
    poupanca1.realizaSaque(300);
    poupanca1.realizaDeposito(200);
    banco2.exibirContas();
    banco2.removerConta(poupanca1);
    banco2.exibirContas();

    System.out.println("\nOperação conta poupança:"); 
    Poupanca poupanca2 = new Poupanca(789, "N678", 400F);
    Banco banco4 = new Banco(789, "Sol", poupanca2);
    banco4.exibirContas();
    poupanca2.realizaSaque(600);
  }
}