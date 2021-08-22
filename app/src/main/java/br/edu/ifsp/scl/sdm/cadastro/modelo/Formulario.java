package br.edu.ifsp.scl.sdm.cadastro.modelo;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    public boolean lista;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Dados {" +
                "Nome Completo - " + nome +
                ", Telefone - " + telefone +
                ", E-mail - " + email +
                ", Deseja Incluir na Lista? = " + lista +
                ", Sexo - " + sexo +
                ", Cidade - " + cidade +
                ", UF - " + uf +
                '}';
    }
}
