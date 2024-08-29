import br.com.jopaulo.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Seguranaç da Informação");
        curso1.setDescricao("Segurança da Informação quanto a profissionais que já trabalham e possuem experiência na área");
        curso1.setCargaHoraria(400);

        Curso curso2 = new Curso();
        curso2.setTitulo("Desenvolvimento Web Full Stack");
        curso2.setDescricao("Desenvolvimento Web Full Stack quanto a profissionais que já trabalham e possuem experiência na área");
        curso2.setCargaHoraria(400);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Desenvolvimento Web Full Stack");
        mentoria.setDescricao("Descrição da pós Desenvolvimento Web Full Stack");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desenvolvimento Web Full Stack quanto a profissionais que já trabalham e possuem experiência na área");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João Paulo");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Euma Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritors Maria: " + devMaria.getConteudoInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritors Maria: " + devMaria.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudoConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

    }
}
