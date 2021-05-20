/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.estoque;

/**
 *
 * @author Natha
 */
//Herança
public class Estoque extends Produto{
//atributo
    private int quantidade_estoque;
 
//métodos construtor
    public void Estoque(int  codigo_produto, String  nome_produto, int valor_produto, int cnpj_fabrica, int quantidade_estoque){
    
    this.codigo_produto = codigo_produto;
    this.nome_produto = nome_produto;
    this.valor_produto = valor_produto;
    this.cnpj_fabrica = cnpj_fabrica;
    this.quantidade_estoque = quantidade_estoque;
        
    }




   
//métodos quantidade_estoque
    public void setQuantidadeEstoque(int quantidade_estoque){
        this.quantidade_estoque = quantidade_estoque;
   
    }
    public int getQuantidadeEstoque(){
        return quantidade_estoque;
    }
    
    public void setposVenda(int quantidade_produtos_venda){
        this.quantidade_estoque =  quantidade_produtos_venda - this.quantidade_estoque ;
    }
    public int getposVenda(){
        return quantidade_estoque;
    }
    


}

