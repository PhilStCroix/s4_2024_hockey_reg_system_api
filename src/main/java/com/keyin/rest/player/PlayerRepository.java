package com.keyin.rest.player;

<<<<<<< HEAD
=======
import com.keyin.rest.division.Division;
>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface PlayerRepository extends CrudRepository {
=======
public interface PlayerRepository extends CrudRepository<Player, Long> {
>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72

}
