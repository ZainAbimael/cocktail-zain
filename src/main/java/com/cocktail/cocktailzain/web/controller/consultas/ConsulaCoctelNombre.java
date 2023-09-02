package com.cocktail.cocktailzain.web.controller.consultas;

import com.cocktail.cocktailzain.domain.dto.CoctelIngredienteDTO;
import com.cocktail.cocktailzain.domain.dto.CoctelNombreDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Consultar")
public class ConsulaCoctelNombre {

    @GetMapping("/nombre/{nombre}")
    public CoctelNombreDTO consultarNombre(@PathVariable("nombre") String nombre){
        RestTemplate restGTemplate = new RestTemplate();
        ResponseEntity<CoctelNombreDTO> rep =
                restGTemplate.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/search.php?s="+nombre, CoctelNombreDTO.class);
        return rep.getBody();
    }

    @GetMapping("/ingrediente/{ingrediente}")
    public CoctelIngredienteDTO consultarIngrediente(@PathVariable("ingrediente") String ingrediente){
        RestTemplate restGTemplate = new RestTemplate();
        ResponseEntity<CoctelIngredienteDTO> rep =
                restGTemplate.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/filter.php?i="+ingrediente, CoctelIngredienteDTO.class);
        return rep.getBody();
    }
}

