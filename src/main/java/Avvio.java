import it.armellini.ivsa.liste.Automobile;
import it.armellini.ivsa.liste.Lista;
import it.armellini.ivsa.liste.Persona;

public class Avvio {

  public static void main(String[] args) {
    Lista<Persona> miaLista = new Lista<>();
    Persona p1 = new Persona("Mario", "Rossi", "RSSMRA...");
    Persona p2 = new Persona("Luigi", "Bianchi", "BNCLGU...");
    Persona p3 = new Persona("Maria", "Rosa", "RSOMRA...");
    miaLista.add(p1);
    miaLista.add(p2);
    miaLista.add(p3);
    
    System.out.println(miaLista);
    
    Lista<Automobile> miaLista2 = new Lista<>();
    Lista<String> miaListaStringhe = new Lista<>();
  }

}
