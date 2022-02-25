package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class dev {
    private String nome;
    private Set<conteudo> conteudosInscrito = new LinkedHashSet<>();
    private  Set<conteudo> conteudosConcluidos= new LinkedHashSet<>();

    public  void  inscreverBootcamp(bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);

    }

        public void progredir() {
            Optional<conteudo>  conteudo = this.conteudosInscrito.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscrito.remove(conteudo.get());
            }else {
                System.err.println("voce nao esta matriculado em nenhum conteudo!");
            }
        }
        public double calcularaTotalXp() {
         return this.conteudosInscrito.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscrito() {
        return conteudosInscrito;
    }

    public void setConteudosInscrito(Set<conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dev dev = (dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscrito, dev.conteudosInscrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluidos);
    }
}
