package br.com.dio.desafio;

public class Mentoria {

   private String Titulo;
    private  String Descricao;
    private LocalDate data;
    private int cargaHoraria;

    public Mentoria() {
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

    public LocalDate getData() {
        return data;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

    public void setData(LocalDate data) {
        this.data = data;



    }
}
