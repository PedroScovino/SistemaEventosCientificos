package devproject.eventosapirest.model;

import javax.persistence.*;

@Entity(name="autor")
public class Autor {

    @Id
    public Integer idAutor;
    @Column(nullable = false)
    public Integer ordem;
    @Column(nullable = false)
    public String email;
    @Column(nullable = false , length = 64)
    public String nomePrimeiro;
    @Column(nullable = false , length = 64)
    public String nomeMeio;
    @Column(nullable = false , length = 64)
    public String sobrenome;
    @Column(nullable = false , length = 256)
    public String afiliacao;
    @Column(nullable = false , length = 256)
    public String afiliacaoEn;
    @Column(nullable = false , length = 2)
    public String pais;
    @Column(nullable = false)
    public String registro;
//    @ManyToOne
//    @JoinColumn(nullable = false)
//    public Artigo artigo;

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomePrimeiro() {
        return nomePrimeiro;
    }

    public void setNomePrimeiro(String nomePrimeiro) {
        this.nomePrimeiro = nomePrimeiro;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getAfiliacaoEn() {
        return afiliacaoEn;
    }

    public void setAfiliacaoEn(String afiliacaoEn) {
        this.afiliacaoEn = afiliacaoEn;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}