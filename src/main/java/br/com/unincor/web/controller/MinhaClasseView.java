/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unincor.web.controller;

import br.com.unincor.sistemacomanda.model.dao.ProdutoDao;
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
    
    public void teste() {
        Produto produto = new Produto();
        //produto.setId(1l);
        produto.setNome("Meu 5 produto");
        produto.setPreco(5000.);
        produto.setEstoque(100.);
        produto.setTipoUnidade(TipoUnidade.UN);
        ProdutoDao produtoDao = new ProdutoDao();
        
        produtoDao.save(produto);
    }
}
