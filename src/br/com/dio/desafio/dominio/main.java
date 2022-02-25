package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
     cursos cursos1 =new cursos();

     cursos1.setTitulo("cursos  de java");
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



    /* System.out.println(cursos1);
     System.out.println(cursos2);
     System.out.println(mentoria);*/

     bootcamp bootcamp = new bootcamp();
     bootcamp.setNome("bootcamp java developer");
     bootcamp.setDescricao("cursos java");
     bootcamp.getConteudos().add(cursos1);
     bootcamp.getConteudos().add(cursos2);
     bootcamp.getConteudos().add(mentoria);

     dev devpablo =new dev();

     devpablo.setNome("pablo");
     devpablo.inscreverBootcamp(bootcamp);
     System.out.println("conteudo inscritos" + devpablo.getConteudosInscrito());
     System.out.println(".");
     devpablo.progredir();

     System.out.println("conteudo inscritos" + devpablo.getConteudosInscrito());
     System.out.println("conteudo concluidos" + devpablo.getConteudosConcluidos());

     System.out.println("XP!" + devpablo.calcularaTotalXp());

     System.out.println(".........");
     dev devlorrane =new dev();

     devlorrane.setNome("lorrane");
     devlorrane.inscreverBootcamp(bootcamp);
     System.out.println("conteudo inscritos" + devlorrane.getConteudosInscrito());
     devlorrane.progredir();
     System.out.println("..");
     System.out.println("conteudo inscritos" + devlorrane.getConteudosInscrito());
     System.out.println("conteudo concluidos" + devlorrane.getConteudosConcluidos());
     System.out.println("XP!" + devlorrane.calcularaTotalXp());








    }
}
