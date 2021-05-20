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
    public class Cliente extends Pessoa {
      

        private String codigo_fidelidade;
    
        public Cliente(int cpf_pessoa, String nome_pessoa) {
        super(cpf_pessoa, nome_pessoa);
        }
        
        public void setClienteCodigoFidelidade(String codigo_fidelidade){
            this.codigo_fidelidade = codigo_fidelidade;
        }
        public String getClienteCodigoFidelidade(){
            return codigo_fidelidade;
        }

    @Override
    public String setEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }       