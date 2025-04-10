package com.ex.barra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.barra.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
