package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ABASTECIMENTO
 * @generated
 */
@Entity
@Table(name = "\"ABASTECIMENTO\"")
@XmlRootElement
public class Abastecimento implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_carro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Carro carro;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_posto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Posto posto;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_abastecimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date data_abastecimento;
  
  /**
  * @generated
  */
  @Column(name = "quilometragem_rodada", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double quilometragem_rodada;
  
  /**
  * @generated
  */
  @Column(name = "litros", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Double litros;
  
  /**
  * @generated
  */
  @Column(name = "combustivel", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String combustivel;
  
  /**
  * @generated
  */
  @Column(name = "preco_por_litro", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String preco_por_litro;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
   * Construtor
   * @generated
   */
  public Abastecimento(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Abastecimento setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém carro
   * return carro
   * @generated
   */
  public Carro getCarro(){
    return this.carro;
  }
  
  /**
   * Define carro
   * @param carro carro
   * @generated
   */
  public Abastecimento setCarro(Carro carro){
    this.carro = carro;
    return this;
  }
  
  /**
   * Obtém posto
   * return posto
   * @generated
   */
  public Posto getPosto(){
    return this.posto;
  }
  
  /**
   * Define posto
   * @param posto posto
   * @generated
   */
  public Abastecimento setPosto(Posto posto){
    this.posto = posto;
    return this;
  }
  
  /**
   * Obtém data_abastecimento
   * return data_abastecimento
   * @generated
   */
  public java.util.Date getData_abastecimento(){
    return this.data_abastecimento;
  }
  
  /**
   * Define data_abastecimento
   * @param data_abastecimento data_abastecimento
   * @generated
   */
  public Abastecimento setData_abastecimento(java.util.Date data_abastecimento){
    this.data_abastecimento = data_abastecimento;
    return this;
  }
  
  /**
   * Obtém quilometragem_rodada
   * return quilometragem_rodada
   * @generated
   */
  public java.lang.Double getQuilometragem_rodada(){
    return this.quilometragem_rodada;
  }
  
  /**
   * Define quilometragem_rodada
   * @param quilometragem_rodada quilometragem_rodada
   * @generated
   */
  public Abastecimento setQuilometragem_rodada(java.lang.Double quilometragem_rodada){
    this.quilometragem_rodada = quilometragem_rodada;
    return this;
  }
  
  /**
   * Obtém litros
   * return litros
   * @generated
   */
  public java.lang.Double getLitros(){
    return this.litros;
  }
  
  /**
   * Define litros
   * @param litros litros
   * @generated
   */
  public Abastecimento setLitros(java.lang.Double litros){
    this.litros = litros;
    return this;
  }
  
  /**
   * Obtém combustivel
   * return combustivel
   * @generated
   */
  public java.lang.String getCombustivel(){
    return this.combustivel;
  }
  
  /**
   * Define combustivel
   * @param combustivel combustivel
   * @generated
   */
  public Abastecimento setCombustivel(java.lang.String combustivel){
    this.combustivel = combustivel;
    return this;
  }
  
  /**
   * Obtém preco_por_litro
   * return preco_por_litro
   * @generated
   */
  public java.lang.String getPreco_por_litro(){
    return this.preco_por_litro;
  }
  
  /**
   * Define preco_por_litro
   * @param preco_por_litro preco_por_litro
   * @generated
   */
  public Abastecimento setPreco_por_litro(java.lang.String preco_por_litro){
    this.preco_por_litro = preco_por_litro;
    return this;
  }
  
  /**
   * Obtém user
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Abastecimento setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Abastecimento object = (Abastecimento)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}