/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.estoque;

import javax.swing.JOptionPane;
import java.math.BigInteger;

/**
 *
 * @author Natha
 */

public class GerenciadorDeEstoque {

    public class setControleSaídaEstoque implements Operacoes{

        @Override
        public void setVenda() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
 
 
   
    public static void main(String[] args) {
        
     int operacao_desejada = 0;
 
     BigInteger contagem = BigInteger.ZERO;
    while(true) {
   contagem = contagem.add(BigInteger.ONE);
  
   
     operacao_desejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a Ação Desejada: \n 1-Manter Produto \n 2 - Gerenciar quantidade de produtos nos Estoque  \n 3- Realizar Venda"));
      JOptionPane.showMessageDialog(null, "Carregando a operacao " +operacao_desejada+ "\n Clique em Ok para Prosseguir..");
     
      if(operacao_desejada==1){
        
 
       Produto CadastrarProduto = new Produto();
//cadastrar produto
        CadastrarProduto.setCodigoProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Produto: ")));
        JOptionPane.showMessageDialog(null, "O codigo do seu produto é: \n"+ CadastrarProduto.getCodigoProduto());
        
        CadastrarProduto.setNomeProduto(JOptionPane.showInputDialog("Digite o Nome do Produto: "));
        JOptionPane.showMessageDialog(null, "O nome do produto é: \n"+ CadastrarProduto.getNomeProduto());
      
        
//Estoque produto
      }else if(operacao_desejada==2){
         Produto CadastrarProduto = new Produto();
         Estoque ManterProduto = new Estoque();
         
        ManterProduto.setQuantidadeEstoque(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos para o Estoque: ")));
        JOptionPane.showMessageDialog(null, "A quantidade de "+ CadastrarProduto.getNomeProduto() +" no Estoque é: \n" +ManterProduto.getQuantidadeEstoque());

//RealizarVenda      
      }else if(operacao_desejada==3){ 
     
           Vendas RealizarVenda = new Vendas();
           Produto CadastrarProduto = new Produto();
          
           RealizarVenda.setCodigoVenda(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da venda: \n")));
          //validacao baseada no codigo do produto
      

          if(RealizarVenda.getCodigoVenda()== CadastrarProduto.getCodigoProduto()){
   
          RealizarVenda.setCodigoFuncionarioVenda(JOptionPane.showInputDialog("Digite seu codigo de funcionario: \n"));
          RealizarVenda.setQuantidadeProdutosVenda(Integer.parseInt(JOptionPane.showInputDialog("Insíra a quantidade de produtos que seram vendidos: \n")));
            //quantidade de produtos a serem vendidos<---
          }
         
      }
    }
   
   
   }

    }

    


    

