package cz.czechitas.java2webapps.ukol7.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Vizitka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(max = 100)
    @NotBlank
    private String celeJmeno;

    @Length(max = 100)
    @NotBlank
    private String firma;

    @Length(max = 100)
    private String email;

    @Length(min = 9, max = 20)
    @Pattern(regexp = "\\+?\\d+")
    private String telefon;

    @Length(max = 100)
    private String web;

    @Length(max = 100)
    @NotBlank
    private String obec;

    @Length(max = 5)
    @NotBlank
    @Pattern(regexp = "\\d{5}")
    private String Psc;

    @Length(max = 100)
    @NotBlank
    private String ulice;


    public String celaAdresa(){
        return ulice + ", " + obec + ", " + Psc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCeleJmeno() {
        return celeJmeno;
    }

    public void setCeleJmeno(String celeJmeno) {
        this.celeJmeno = celeJmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return Psc;
    }

    public void setPsc(String Psc) {
        this.Psc = Psc;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public Vizitka(Integer id, String celeJmeno, String firma, String email, String telefon, String web, String obec, String Psc, String ulice) {
        this.id = id;
        this.celeJmeno = celeJmeno;
        this.firma = firma;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
        this.obec = obec;
        this.Psc = Psc;
        this.ulice = ulice;
    }

    public Vizitka() {
    }
}
