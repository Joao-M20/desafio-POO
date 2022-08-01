import br.com.my.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso();

        //Polimorfismo: tudo que o Conteudo tem, tem em Curso, mas nem tudo que tem em Curso tem em Conteudo.

        //Conteudo conteudo = new Mentoria();   Conteudo é mãe de Curso e Mentoria.


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIvan = new Dev();
        devIvan.setNome("Ivan");
        devIvan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ivan" + devIvan.getConteudosInscritos());

        devIvan.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Ivan" + devIvan.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ivan" + devIvan.getConteudosConcluidos());
        System.out.println("XP: " + devIvan.calcularTotalXp());

        System.out.println("-------------------------");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
