package org.rodrigolunus.generalshoppe.repositories;


import org.rodrigolunus.generalshoppe.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
