package com.senai.biblioteca.banco.models;

public class Conta {
    private int id;
    private String username;
    private String senha;
    private String email;
    private String telefone;

    public Conta () {}
    public Conta (String username, String senha, String email, String telefone) {
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }
    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

}

