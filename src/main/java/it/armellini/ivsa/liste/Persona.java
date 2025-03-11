package it.armellini.ivsa.liste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Persona {
  private String nome;
  private String cognome;
  private String codiceFiscale;
}
