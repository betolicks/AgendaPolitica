package entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author pmm-dev
 */

@Entity
@Table(name="tab_compromissos")
public class Compromissos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;    
       
    @Temporal(TemporalType.DATE)
    private Date dtcompromisso;
    
    @Temporal(TemporalType.DATE)
    private Date dtentrada;
    
    @Temporal(TemporalType.TIME)
    private Date hrcompromisso;
    
    private String titulo;
    private String status;
    private String localizacao;
    private String descricao;

    public Date getDtcompromisso() {
        return dtcompromisso;
    }

    public void setDtcompromisso(Date dtcompromisso) {
        this.dtcompromisso = dtcompromisso;
    }

    public Date getHrcompromisso() {
        return hrcompromisso;
    }

    public void setHrcompromisso(Date hrcompromisso) {
        this.hrcompromisso = hrcompromisso;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compromissos other = (Compromissos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}