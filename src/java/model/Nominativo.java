/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "nominativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nominativo.findAll", query = "SELECT n FROM Nominativo n")
    , @NamedQuery(name = "Nominativo.findBySeqNominativo", query = "SELECT n FROM Nominativo n WHERE n.seqNominativo = :seqNominativo")
    , @NamedQuery(name = "Nominativo.findByNome", query = "SELECT n FROM Nominativo n WHERE n.nome = :nome")
    , @NamedQuery(name = "Nominativo.findByCognome", query = "SELECT n FROM Nominativo n WHERE n.cognome = :cognome")
    , @NamedQuery(name = "Nominativo.findByTelefono", query = "SELECT n FROM Nominativo n WHERE n.telefono = :telefono")
    , @NamedQuery(name = "Nominativo.findByCellulare", query = "SELECT n FROM Nominativo n WHERE n.cellulare = :cellulare")
    , @NamedQuery(name = "Nominativo.findByEmail", query = "SELECT n FROM Nominativo n WHERE n.email = :email")})
public class Nominativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seq_nominativo")
    private Integer seqNominativo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nome")
    private String nome;
    @Size(max = 50)
    @Column(name = "cognome")
    private String cognome;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 20)
    @Column(name = "cellulare")
    private String cellulare;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;

    public Nominativo() {
    }

    public Nominativo(Integer seqNominativo) {
        this.seqNominativo = seqNominativo;
    }

    public Nominativo(Integer seqNominativo, String nome) {
        this.seqNominativo = seqNominativo;
        this.nome = nome;
    }

    public Integer getSeqNominativo() {
        return seqNominativo;
    }

    public void setSeqNominativo(Integer seqNominativo) {
        this.seqNominativo = seqNominativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seqNominativo != null ? seqNominativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nominativo)) {
            return false;
        }
        Nominativo other = (Nominativo) object;
        if ((this.seqNominativo == null && other.seqNominativo != null) || (this.seqNominativo != null && !this.seqNominativo.equals(other.seqNominativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Nominativo[ seqNominativo=" + seqNominativo + " ]";
    }
    
}
