/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
 * @author danie
 */
@Entity
@Table(name = "Banda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banda.findAll", query = "SELECT b FROM Banda b")
    , @NamedQuery(name = "Banda.findById", query = "SELECT b FROM Banda b WHERE b.id = :id")
    , @NamedQuery(name = "Banda.findByNombreArtistico", query = "SELECT b FROM Banda b WHERE b.nombreArtistico = :nombreArtistico")
    , @NamedQuery(name = "Banda.findByRepresentante", query = "SELECT b FROM Banda b WHERE b.representante = :representante")
    , @NamedQuery(name = "Banda.findByUltimoAlbum", query = "SELECT b FROM Banda b WHERE b.ultimoAlbum = :ultimoAlbum")
    , @NamedQuery(name = "Banda.findByNominaciones", query = "SELECT b FROM Banda b WHERE b.nominaciones = :nominaciones")
    , @NamedQuery(name = "Banda.findByLinkMejorCancion", query = "SELECT b FROM Banda b WHERE b.linkMejorCancion = :linkMejorCancion")
    , @NamedQuery(name = "Banda.findByCorreoDeContacto", query = "SELECT b FROM Banda b WHERE b.correoDeContacto = :correoDeContacto")})
public class Banda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreArtistico")
    private String nombreArtistico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "representante")
    private String representante;
    @Size(max = 25)
    @Column(name = "ultimoAlbum")
    private String ultimoAlbum;
    @Size(max = 500)
  
    @Column(name = "nominaciones")
    private String nominaciones;
    @Size(max = 100)
    @Column(name = "linkMejorCancion")
    private String linkMejorCancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "correoDeContacto")
    private String correoDeContacto;

    public Banda() {
    }

    public Banda(Integer id) {
        this.id = id;
    }

    public Banda(Integer id, String nombreArtistico, String representante, String correoDeContacto) {
        this.id = id;
        this.nombreArtistico = nombreArtistico;
        this.representante = representante;
        this.correoDeContacto = correoDeContacto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getUltimoAlbum() {
        return ultimoAlbum;
    }

    public void setUltimoAlbum(String ultimoAlbum) {
        this.ultimoAlbum = ultimoAlbum;
    }

    public String getNominaciones() {
        return nominaciones;
    }

    public void setNominaciones(String nominaciones) {
        this.nominaciones = nominaciones;
    }

    public String getLinkMejorCancion() {
        return linkMejorCancion;
    }

    public void setLinkMejorCancion(String linkMejorCancion) {
        this.linkMejorCancion = linkMejorCancion;
    }

    public String getCorreoDeContacto() {
        return correoDeContacto;
    }

    public void setCorreoDeContacto(String correoDeContacto) {
        this.correoDeContacto = correoDeContacto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banda)) {
            return false;
        }
        Banda other = (Banda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Banda[ id=" + id + " ]";
    }
    
}
