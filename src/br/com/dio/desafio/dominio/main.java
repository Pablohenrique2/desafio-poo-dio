package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
     cursos cursos1 =new cursos();

     cursos1.setTitulo("cursos javas");
     cursos1.setDescricao("Descrição java curso");
     cursos1.setCargaHoraria(8);

     cursos cursos2 =new cursos();

     cursos2.setTitulo("cursos PHP");
     cursos2.setDescricao("Descrição PHP curso");
     cursos2.setCargaHoraria(22);




     mentoria mentoria = new mentoria();
     mentoria.setTitulo("mentoria de java");
     mentoria.setDescricao("apresentando java");
     mentoria.setData(LocalDate.now());



     System.out.println(cursos1);
     System.out.println(cursos2);
     System.out.println(mentoria);
    }
}
