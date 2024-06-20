public class Corrente extends Conta{
  private float limite = 500f;

  //print valores
  public String toString(){ 
    return super.toString() + " limite: " + this.limite;
  }

  //realizar saque
  public void realizaSaque(float valor){
    float saldo = super.consultaSaldo();
    if(valor < (saldo+limite)){
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

  //construtor
  public Corrente (int id, String numero, float saldo){
    super (id, numero, saldo);
  }
}