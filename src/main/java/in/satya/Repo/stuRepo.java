package in.satya.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satya.Entity.studentEntity;

public interface stuRepo extends JpaRepository<studentEntity, Integer>{

}
