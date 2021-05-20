/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.estoque;

import javax.swing.JOptionPane;
/**
 *
 * @author Natha
 */
public  class  Produto {
 //atributos   
  int  codigo_produto=0;
   String  nome_produto = "";
  int valor_produto;
   int cnpj_fabrica;

    public void Produto(int codigo_produto, String nome_produto, int valor_produto, int cnpj_fabrica){
    this.codigo_produto = codigo_produto;
    this.nome_produto = nome_produto;
    this.valor_produto = valor_produto;
    this.cnpj_fabrica = cnpj_fabrica;
}

    
//métodos codigo_produto
    public void setCodigoProduto(int codigo_produto){
        this.codigo_produto = codigo_produto;
   
    }
    public int getCodigoProduto(){
        return codigo_produto;
    }
    
//métodos nome_produto    
    public void setNomeProduto(String nome_produto){
        this.nome_produto = nome_produto;
    }
    public String getNomeProduto(){
        return nome_produto;
    }
    
//métodos valor_produto  
    public void setValorProduto(int valor_produto){
        this.valor_produto = valor_produto;
    }
    public String getValorProduto(){
        return nome_produto;
    }

//métodos cnpj_fabrica

    public void setCnpjFabrica(String cnpj_fabrica){
        this.cnpj_fabrica = Integer.parseInt(cnpj_fabrica);
        
    }
    public int getCnpjFabrica(){
        return cnpj_fabrica;    
    }
    

}
