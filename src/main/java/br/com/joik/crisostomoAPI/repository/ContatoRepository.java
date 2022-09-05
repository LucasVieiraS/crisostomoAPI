package br.com.joik.crisostomoAPI.repository;

import br.com.joik.crisostomoAPI.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
