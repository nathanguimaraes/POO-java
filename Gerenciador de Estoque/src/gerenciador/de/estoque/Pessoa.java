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
    public abstract class Pessoa {
        private int cpf_pessoa;
        private String nome_pessoa;

    public Pessoa(int cpf_pessoa, String nome_pessoa){
        this.cpf_pessoa = cpf_pessoa;
        this.nome_pessoa = nome_pessoa;
    }
    public void setNomePessoa(String nome_pessoa){
        this.nome_pessoa = nome_pessoa;
    }
    public String getNomePessoa(){
        return nome_pessoa;
    }
    public void setCpfPessoa(int cpf_pessoa){
        this.cpf_pessoa = cpf_pessoa;
    }
    public int getCpfPessoa(){
        return cpf_pessoa;
    }
        
    public abstract String setEndereco();
}
