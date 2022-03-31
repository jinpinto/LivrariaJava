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
public class Livro {
    private int id;
    private String name;
    private int isbn;
    private String editora;
    private int edicao;
    private Data data;

    public Livro(int id, String name, int isbn, String editora, int edicao, Data data, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.editora = editora;
        this.edicao = edicao;
        this.data = new Data(day, month, year);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Data getData() {
        return data;
    }

    public void setData(int day,int month,int year) {
        this.data = new Data(day, month, year);
    }
  
}
