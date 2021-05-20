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
    public class Vendas {

    static Vendas RealizarVenda;
        //atributos  
            private int codigo_venda; 
            private float valor_venda;
            private String codigo_funcionario_venda;
            private int quantidade_produtos_venda;
            private int total_pos_vendas;
      
//método construtor
    public void Vendas(int codigo_venda, float valor_venda, String data_venda, String codigo_funcionario_venda, int quantidade_produtos_venda){
    
    this.codigo_venda = codigo_venda;
    this.valor_venda = valor_venda;
    this.codigo_funcionario_venda = codigo_funcionario_venda;
    this.quantidade_produtos_venda = quantidade_produtos_venda;
    }


    




    
//métodos codigo_venda
    public void setCodigoVenda(int codigo_venda){
        this.codigo_venda = codigo_venda;
   
    }
    public int getCodigoVenda(){
        return codigo_venda;
    }

//métodos valor_veda    
    public void setValorVenda(float valor_venda){
        this.valor_venda = valor_venda;
    }
    public float getValorVenda(){
        return valor_venda ;
    }
    
//métodos codigo_funcionario_venda
    public void setCodigoFuncionarioVenda(String codigo_funcionario_venda){
        this.codigo_funcionario_venda = codigo_funcionario_venda;
    }
    public String getCodigoFuncionarioVenda(){
        return codigo_funcionario_venda;
    }
   
//métodos quantidade_produtos_venda
     public void setQuantidadeProdutosVenda(int quantidade_produtos_venda){
         this.quantidade_produtos_venda = quantidade_produtos_venda;
    }
}

