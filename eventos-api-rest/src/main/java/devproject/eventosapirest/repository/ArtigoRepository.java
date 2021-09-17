package devproject.eventosapirest.repository;

import devproject.eventosapirest.model.Artigo;
import org.springframework.data.repository.CrudRepository;

public interface ArtigoRepository extends CrudRepository <Artigo, Integer> {
}
