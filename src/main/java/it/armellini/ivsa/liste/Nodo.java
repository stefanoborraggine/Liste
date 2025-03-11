package it.armellini.ivsa.liste;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Nodo {
  private Persona info;
  private Nodo link;
}