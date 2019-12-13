/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.repository;

import br.com.alura.forum.Model.Topico;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lucas
 */
public interface TopicoRepository extends JpaRepository<Topico, Long>{

    /**
     *
     * @param nomeCurso
     * @return
     */
    public List<Topico> findByCursoNome(String nomeCurso);
    
    //metodos cruds ja vem herdados de JpaRepository
}
