package devproject.eventosapirest.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "volume")
public class Volume {

    @Id
    public Integer idVolume;
    @Column(nullable = false , length = 32)
    public String sigla;
    @Column(nullable = false)
    public Integer numEdicao;
    @Column(nullable = false , length = 64)
    public String cidade;
    @Column(nullable = false)
    public String dataInicio;
    @Column(nullable = false , length = 2048)
    public String descricaoPt;
    @Column(nullable = false , length = 2048)
    public String descricaoEn;
//    @OneToMany()
//    @OrderBy("ordem asc")
//    public List<Artigo> artigos;

    public Integer getIdVolume() {
        return idVolume;
    }

    public void setIdVolume(Integer idVolume) {
        this.idVolume = idVolume;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(Integer numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDescricaoPt() {
        return descricaoPt;
    }

    public void setDescricaoPt(String descricaoPt) {
        this.descricaoPt = descricaoPt;
    }

    public String getDescricaoEn() {
        return descricaoEn;
    }

    public void setDescricaoEn(String descricaoEn) {
        this.descricaoEn = descricaoEn;
    }
}
