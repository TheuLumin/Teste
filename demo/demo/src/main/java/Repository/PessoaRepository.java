package Repository;

import Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

    Pessoa findById(long id);
}
