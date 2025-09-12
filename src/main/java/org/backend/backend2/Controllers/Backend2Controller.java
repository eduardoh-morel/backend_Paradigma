package org.backend.backend2.Controllers;

import org.backend.backend2.Configs.backend2Config;
import org.backend.backend2.DTO.Backend2DTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/backend2")
public class Backend2Controller {

    private final backend2Config config;

    public Backend2Controller(backend2Config config) {
        this.config = config;
    }

    @GetMapping({"", "/{pathName}"})
    public ResponseEntity<String> greetGet(
            @PathVariable Optional<String> pathName,
            @RequestParam(required = false) String queryName
    ) {
        String greeting = config.getGreeting();

        String nameReturn = queryName != null
                ? queryName
                : pathName.orElseGet(config::getDefaultname);

        return ResponseEntity.ok(String.format("%s, %s!!!", greeting, nameReturn));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> greetPost(@RequestBody Backend2DTO request) {
        String greeting = config.getGreeting();
        String who = (request.getName() != null && !request.getName().isBlank())
                ? request.getName()
                : config.getDefaultname();
        return ResponseEntity.ok(String.format("%s, %s!!!", greeting, who));
    }
}
