package it.armellini.ivsa.liste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
// @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona {
  private String nome;
  private String cognome;
  
  // @Include
  private String codiceFiscale;
  
  @Override
  public boolean equals(Object other) {
    if (null == this || null == other) {
      return false;
    }
    
    if (!(other instanceof Persona)) {
      return false;
    }
    Persona pOther = (Persona)other;
    return this.getCodiceFiscale().equals(pOther.getCodiceFiscale());
  }
  
  
  
}
