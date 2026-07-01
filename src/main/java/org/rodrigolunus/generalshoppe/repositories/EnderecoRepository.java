package org.rodrigolunus.generalshoppe.repositories;


import org.rodrigolunus.generalshoppe.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
