package org.rodrigolunus.generalshoppe.repositories;


import org.rodrigolunus.generalshoppe.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
