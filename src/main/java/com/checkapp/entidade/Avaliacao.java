package com.checkapp.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "avaliacao")
public class Avaliacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String resposta;

    private String observacao;
    
    //depois desmarcar
    
    @OneToMany (mappedBy="avaliacao",cascade = CascadeType.ALL) //qqer coisa tirar o cascade
    private List<Item> itens;
    
    @ManyToOne 
    @JoinColumn(name="id_inspecao")
    private Inspecao inspecao;    

    public Avaliacao() {
    }

    public Avaliacao(String resposta, String observacao, List<Item> itens, Inspecao inspecao) {
        this.resposta = resposta;
        this.observacao = observacao;
        this.itens = itens;
        this.inspecao = inspecao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

//    public boolean isAvaliacao() {
//        return avaliacao;
//    }
//
//    public void setAvaliacao(boolean avaliacao) {
//        this.avaliacao = avaliacao;
//    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }

    public Inspecao getInspecao() {
        return inspecao;
    }

    public void setInspecao(Inspecao inspecao) {
        this.inspecao = inspecao;
    }
            
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
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
        Avaliacao other = (Avaliacao) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
