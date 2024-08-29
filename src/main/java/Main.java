import br.com.jopaulo.desafio.dominio.Curso;
import br.com.jopaulo.desafio.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Desenvolvimento Web Full Stack");
        mentoria.setDescricao("Descrição da pós Desenvolvimento Web Full Stack");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
