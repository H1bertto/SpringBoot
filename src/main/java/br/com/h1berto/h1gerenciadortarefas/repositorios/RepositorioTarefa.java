package br.com.h1berto.h1gerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.h1berto.h1gerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{

}
