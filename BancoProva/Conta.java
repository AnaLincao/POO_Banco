abstract class Conta implements Operacao{

  private int id;
  private String numero;
  private float saldo;
  
  public float consultaSaldo(){
    return saldo;
  }
  public void realizaSaque(float valor){
  }
  public void realizaDeposito(float valor){
  }

  //construtor
  public Conta (int id, String numero, float saldo){
    this.id = id;
    this.numero = numero;
    this.saldo = saldo;
  }

  public void getSaldo(float saldo){
    this.saldo=saldo;
  }

  //print valores
  public String toString(){ 
    return "ID: " + this.id + " Numero: " + this.numero+ " Saldo: " +this.saldo;
  }
}

