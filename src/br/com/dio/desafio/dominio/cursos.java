package br.com.dio.desafio.dominio;

public class cursos extends  conteudo{

  private int cargaHoraria;


  public cursos() {
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
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }
}
