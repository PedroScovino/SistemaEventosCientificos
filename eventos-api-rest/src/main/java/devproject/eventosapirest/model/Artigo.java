package devproject.eventosapirest.model;

import javax.persistence.*;

@Entity(name = "artigo")
public class Artigo {

    @Id
    public Integer idArtigo;
    @Column(nullable = false)
    public Integer ordem;
    @Column(nullable = false , length = 2)
    public String idioma;
    @Column(nullable = false , length = 256)
    public String titulo;
    @Column(nullable = false , length = 256)
    public String tituloEn;
    @Column(nullable = false , length = 2048)
    public String resumo;
    @Column(nullable = false , length = 2048)
    public String resumoEn;
    @Column(nullable = false , length = 256)
    public String palavraChave;
    @Column(nullable = false , length = 256)
    public String palavraChaveEn;
    @Column(nullable = false)
    public Integer numPaginas;
//    @ManyToOne
//    public Volume volume;

    public Integer getIdArtigo() {
        return idArtigo;
    }

    public void setIdArtigo(Integer idArtigo) {
        this.idArtigo = idArtigo;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloEn() {
        return tituloEn;
    }

    public void setTituloEn(String tituloEn) {
        this.tituloEn = tituloEn;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumoEn() {
        return resumoEn;
    }

    public void setResumoEn(String resumoEn) {
        this.resumoEn = resumoEn;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChaveEn() {
        return palavraChaveEn;
    }

    public void setPalavraChaveEn(String palavraChaveEn) {
        this.palavraChaveEn = palavraChaveEn;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}
