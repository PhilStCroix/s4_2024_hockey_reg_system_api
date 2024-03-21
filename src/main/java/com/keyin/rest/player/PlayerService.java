package com.keyin.rest.player;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
import com.keyin.rest.division.Division;
import com.keyin.rest.division.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepository.findAll();
    }

    public Player getPlayerById(long id) {
<<<<<<< HEAD
        Optional<Player> playerOptional = playerRepository.findById(id);
        return playerOptional.orElse(null);
    }

    public Player createPlayer(Player player) {
        return (Player) playerRepository.save(player);
    }
=======
        Optional<Player> divisionOptional = playerRepository.findById(id);

        return divisionOptional.orElse(null);
    }

>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
    public void deletePlayerById(long id) {
        playerRepository.deleteById(id);
    }

<<<<<<< HEAD
    public Player updatePlayer(long id, Player player) {
        Optional<Player> playerUpdateOptional = playerRepository.findById(id);
        if (playerUpdateOptional.isPresent()) {
            Player playerUpdate = playerUpdateOptional.get();
            playerUpdate.setBirthday(player.getBirthday());
            playerUpdate.setFirstName(player.getFirstName());
            playerUpdate.setLastName(player.getLastName());
            return (Player) playerRepository.save(playerUpdate);
        } else {
            return null;
        }
    }


=======
    public Player createPlayer(Player newPlayer) {
        return playerRepository.save(newPlayer);
    }

    public Player updatePlayer(long id, Player updatedPlayer) {
        Optional<Player> playerToUpdateOptional = playerRepository.findById(id);

        if (playerToUpdateOptional.isPresent()) {
            Player playerToUpdate = playerToUpdateOptional.get();

            playerToUpdate.setFirstName(updatedPlayer.getFirstName());
            playerToUpdate.setLastName(updatedPlayer.getLastName());
            playerToUpdate.setBirthday(updatedPlayer.getBirthday());

            return playerRepository.save(playerToUpdate);
        }

        return null;
    }
>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
}
