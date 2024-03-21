package com.keyin.rest.player;

<<<<<<< HEAD
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

=======
import com.keyin.rest.division.Division;
import com.keyin.rest.division.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
@RestController
@CrossOrigin
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/player")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/player/{id}")
    public Player getPlayerById(@PathVariable long id) {
        return playerService.getPlayerById(id);
    }

    @PostMapping("/player")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    @PutMapping("/player/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable long id, @RequestBody Player player) {
        return ResponseEntity.ok(playerService.updatePlayer(id, player));
    }

    @DeleteMapping("/player/{id}")
    public void deletePlayerById(@PathVariable long id) {
        playerService.deletePlayerById(id);
    }
<<<<<<< HEAD

=======
>>>>>>> 186373c95fc181d746ab99e0de828f16d3a98b72
}
