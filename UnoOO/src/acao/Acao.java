package acao;
import base.Roda;
import base.Jogada;

abstract class Acao {
  /**
   * Função que indica para uma função o nome de outras funções
   * @param roda
   */
  abstract void realizar(Roda roda);
  abstract void realizar(Jogada jogada);
  abstract void realizar(Roda roda, Jogada jogada);
}

/**
 * @deprecated
 * @author Fernando Favaro Moreira
 * @since 03/10/2022
 * @version 1.0
 * @see Roda, Jogada
 */