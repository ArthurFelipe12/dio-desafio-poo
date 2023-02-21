package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devArthur = new Dev();
		devArthur.setNome("Arthur");
		devArthur.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Arthur:" + devArthur.getConteudosInscritos());
		devArthur.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Arthur:" + devArthur.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Arthur:" + devArthur.getConteudosConcluidos());
		System.out.println("XP: " + devArthur.calcularTotalXp());
		
		System.out.println("-------");
		
		
		
		Dev devFelipe = new Dev();
		devFelipe.setNome("Felipe");
		devFelipe.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Felipe:" + devFelipe.getConteudosInscritos());
		devFelipe.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Felipe:" + devFelipe.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Felipe:" + devFelipe.getConteudosConcluidos());
		System.out.println("XP: " + devFelipe.calcularTotalXp());
		
	}

}
