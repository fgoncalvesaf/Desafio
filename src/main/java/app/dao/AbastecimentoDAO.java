package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AbastecimentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AbastecimentoDAO extends JpaRepository<Abastecimento, java.lang.String> {

  /**
   * Obtém a instância de Abastecimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Abastecimento entity WHERE entity.id = :id")
  public Abastecimento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Abastecimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Abastecimento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Abastecimento a")
  public Page<Abastecimento> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Abastecimento a where a.carro.id = :carroId")
  public Page<Abastecimento> listByCarro(@Param(value="carroId") java.lang.String carroId, Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Abastecimento a where a.posto.id = :postoId")
  public Page<Abastecimento> listByPosto(@Param(value="postoId") java.lang.String postoId, Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select a from Abastecimento a where a.user.id = :userId")
  public Page<Abastecimento> listByUser(@Param(value="userId") java.lang.String userId, Pageable pageable);
  


}