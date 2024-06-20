public class Poupanca extends Conta{
  private float taxaJuro;

  //print valores
  public String toString(){ 
    return super.toString() + " taxa de juros: " + this.taxaJuro;
  }
  
  //realizar saque
  public void realizaSaque(float valor){
    float saldo = super.consultaSaldo();
    if(valor < saldo){
      saldo = saldo - valor;
      super.getSaldo(saldo);
    }else{
    System.out.println("Saque não poderá ser realizado");
    }
  }
  
  //realizar deposito
  public void realizaDeposito(float valor){
    float saldo = super.consultaSaldo();
    saldo = saldo + valor;
    super.getSaldo(saldo);
  }

  //Construtor
  public Poupanca (int id, String numero, float saldo){
    super (id, numero, saldo);
  }
} 