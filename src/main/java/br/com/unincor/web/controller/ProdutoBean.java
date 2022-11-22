/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unincor.web.controller;

import br.com.unincor.sistemacomanda.model.dao.ProdutoDao;
import br.com.unincor.sistemacomanda.model.domain.Produto;
import br.com.unincor.sistemacomanda.model.domain.TipoUnidade;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author dioge
 */
@Getter
@Setter
@ManagedBean
@ViewScoped
public class ProdutoBean implements Serializable {
    
    private Produto produto = new Produto();
    
    public void salvar() {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.save(produto);
        /* Gera uma mensagem de sucesso */
        FacesContext.getCurrentInstance().addMessage("",
                new FacesMessage("Salvo com sucesso!"));
        /* Chamamos o cancelar para limpar o nosso objeto após salvar */
        cancelar();
    }
    
    /* Ao cancelar criamos um novo produto para que a tela atualize */
    public void cancelar() {
        produto = new Produto();
    }
    
    public List<TipoUnidade> getTiposUnidades() {
        return Arrays.asList(TipoUnidade.values());
    }
    
}
