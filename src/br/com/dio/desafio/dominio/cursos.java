package br.com.dio.desafio.dominio;

public class cursos {
  private String titulo;
  private String descricao;
  private int cargaHoraria;


  public cursos() {
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "cursos{" +
            "titulo='" + titulo + '\'' +
            ", descricao='" + descricao + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}
