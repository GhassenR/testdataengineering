package tn.test.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.test.data.entities.Environnement;

@Repository
public interface EnvironnementRepository extends JpaRepository<Environnement,Long> {

}
