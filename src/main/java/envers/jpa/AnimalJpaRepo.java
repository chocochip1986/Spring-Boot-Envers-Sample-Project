package envers.jpa;

import envers.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalJpaRepo extends JpaRepository<Animal, Long> {
}
