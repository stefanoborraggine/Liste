package it.armellini.ivsa.liste;

public class Lista {
  private Nodo testa = null;
  private int numeroElementi = 0;
  
  public void add(Persona info) {
    Nodo nNodo = new Nodo(info, this.testa);
    this.testa = nNodo;
    numeroElementi++;
  }
  
  // remove
  
  // search
  
  public void print() {
    Nodo temp = this.testa;
    while(null != temp) {
      System.out.println(temp.getInfo());
      temp = temp.getLink();
    }
  }
  
  public Persona get(int pos) {
    return null;
  }
  
  public int size() {
    return numeroElementi;
  }
}
