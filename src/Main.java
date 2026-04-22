import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso .Net");
        curso2.setDescricao("Descrição curso .Net");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());


/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGiovanni = new Dev();
        devGiovanni.setNome("Giovanni");
        devGiovanni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Giovanni" +devGiovanni.getConteudosInscritos());
        devGiovanni.progredir();
        devGiovanni.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Incritos Giovanni" +devGiovanni.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Giovanni" +devGiovanni.getConteudosConcluidos());
        System.out.println("XP: "+devGiovanni.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");
        Dev devHedla = new Dev();
        devHedla.setNome("Hedla");
        devHedla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Hedla" +devHedla.getConteudosInscritos());
        devHedla.progredir();
        devHedla.progredir();
        devHedla.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Incritos Hedla" +devHedla.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Hedla" +devHedla.getConteudosConcluidos());
        System.out.println("XP: "+devHedla.calcularTotalXp());






    }
}
