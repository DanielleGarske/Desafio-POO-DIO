package br.com.dio.desafio;

public class Main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.getDescricao("Descrição Mentoria Java") ;
        mentoria.setData(LocalDate.now());

        system.out.println(curso1);
        system.out.println(curso2);
        system.out.println(mentoria);



    }


}
