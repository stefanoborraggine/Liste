package it.armellini.ivsa.liste;

public class Lista<T> {
  private Nodo<T> testa = null;
  private int numeroElementi = 0;

  public void add(T info) {
    Nodo<T> nNodo = new Nodo<>(info, this.testa);
    this.testa = nNodo;
    numeroElementi++;
  }

  public void remove (T info) {
    // && and, ! not, || or
    if (null == testa || null == info) {
      return;
    }
    
    Nodo<T> temp = testa;
    Nodo<T> prec = testa;
        
    while(null != temp && !info.equals(temp.getInfo())) {
      prec = temp;
      temp = temp.getLink();
    }
    
    // ho trovato info da cancellare?
    if (null != temp) {
      prec.setLink(temp.getLink());
    }
    
  }

  // search

  public void print() {
    Nodo<T> temp = this.testa;
    while (null != temp) {
      System.out.println(temp.getInfo());
      temp = temp.getLink();
    }
  }

  public T get(int pos) {
    return null;
  }

  public int size() {
    return numeroElementi;
  }
}
