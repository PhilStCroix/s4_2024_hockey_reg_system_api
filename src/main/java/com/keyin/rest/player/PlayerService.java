package com.keyin.rest.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return (List<Player>) playerRepository.findAll();
    }

    public Player getPlayerById(long id) {
        Optional<Player> playerOptional = playerRepository.findById(id);
        return playerOptional.orElse(null);
    }

    public Player createPlayer(Player player) {
        return (Player) playerRepository.save(player);
    }
    public void deletePlayerById(long id) {
        playerRepository.deleteById(id);
    }

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


}
