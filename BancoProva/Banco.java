import java.util.List;
import java.util.ArrayList;

public class Banco {
  private int numero;
  private String nome;
  private List<Conta> contas = new ArrayList<Conta>();
  
  public void cadastrarConta(Conta conta){
    contas.add(conta);
  }

  public void removerConta(Conta conta){
    contas.remove(conta);
  }

  public void exibirContas(){
    for(Conta c : contas){
      System.out.println(c.toString());
    }
  }

  //construtor
  public Banco (int numero, String nome, Conta conta){
    this.numero = numero;
    this.nome = nome;
    cadastrarConta(conta);
  }  
}