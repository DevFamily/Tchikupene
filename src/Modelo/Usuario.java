package Modelo;
// Generated Oct 22, 2018 11:39:57 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private String NUsuario;
     private String nome;
     private String morada;
     private int contacto;
     private String email;
     private String NAcesso;
     private Set produtos = new HashSet(0);
     private Set vendas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String NUsuario, String nome, String morada, int contacto, String email, String NAcesso) {
        this.NUsuario = NUsuario;
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
        this.email = email;
        this.NAcesso = NAcesso;
    }
    public Usuario(String NUsuario, String nome, String morada, int contacto, String email, String NAcesso, Set produtos, Set vendas) {
       this.NUsuario = NUsuario;
       this.nome = nome;
       this.morada = morada;
       this.contacto = contacto;
       this.email = email;
       this.NAcesso = NAcesso;
       this.produtos = produtos;
       this.vendas = vendas;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getNUsuario() {
        return this.NUsuario;
    }
    
    public void setNUsuario(String NUsuario) {
        this.NUsuario = NUsuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMorada() {
        return this.morada;
    }
    
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public int getContacto() {
        return this.contacto;
    }
    
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNAcesso() {
        return this.NAcesso;
    }
    
    public void setNAcesso(String NAcesso) {
        this.NAcesso = NAcesso;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }




}


