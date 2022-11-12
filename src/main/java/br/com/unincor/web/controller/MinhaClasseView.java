/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unincor.web.controller;

import br.com.unincor.sistemacomanda.model.domain.Produto;
import br.com.unincor.sistemacomanda.model.domain.TipoUnidade;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
@ManagedBean
@SessionScoped
public class MinhaClasseView implements Serializable {
    
    private String teste = "Meu texto de Exemplo";    
    private Produto produto = new Produto();
    
    public List<TipoUnidade> getTiposUnidades() {
        return Arrays.asList(TipoUnidade.values());
    }
}
