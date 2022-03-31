/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

import utilitario.Data;


/**
 *
 * @author aluno.cyber
 */
public class EmprestimoLivro extends Livro{
    
    private Data dataDeEmprestimo;
    private Data dataDeDevolucao;
    private String cpf;
    private String name;

    public EmprestimoLivro(int id, String name, int isbn, String editora, int edicao, Data data, int day, int month, int year) {
        super(id, name, isbn, editora, edicao, data, day, month, year);
    }

    
}
