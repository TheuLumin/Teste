package Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String nome;
    private String dataNasc;
    private String logradouro;
    private int numEndereco;
    private String cidade;
    private int cep;

    public Pessoa() {
    }

    // Construtor com função de disponibilizar o acesso as classes //
    public Pessoa(long id, String nome, String dataNascimento,
                  String logradouro, int numeroEndereco, String cidade, int cep) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNascimento;
        this.logradouro = logradouro;
        this.numEndereco = numeroEndereco;
        this.cidade = cidade;
        this.cep = cep;
    }

    // Getters e setters retornando os atributos e permitindo sua alteração //
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(int numEndereco) {
        this.numEndereco = numEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
