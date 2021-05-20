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
// herança 
    public class Funcionario extends Pessoa {
        private String codigo_funcionario;

         public Funcionario(int cpf_pessoa, String nome_pessoa) {
            super(cpf_pessoa, nome_pessoa);
        }

//métodos funcionario    
        public void setCodigoFuncionario(String codigo_funcionario){
        this.codigo_funcionario = codigo_funcionario;
        }
        
        public String getCodigoFucnionario(){
            return codigo_funcionario;
        }

    @Override
    public String setEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}