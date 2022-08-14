package br.com.cadastroclientes_.infotec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cadastroclientes_.infotec.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query (value = "select c from Cliente c Where upper(trim(c.nome)) like %?1%")
	List<Cliente> buscarPorNome(String name);
	
}
