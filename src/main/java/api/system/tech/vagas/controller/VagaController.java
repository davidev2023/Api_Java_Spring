package api.system.tech.vagas.controller;


import api.system.tech.vagas.model.Usuario;
import api.system.tech.vagas.model.Vaga;
import api.system.tech.vagas.repository.VagaRepository;
import api.system.tech.vagas.service.VagaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaga")
public class VagaController {
    private final VagaService service;
    private final VagaRepository repository ;
    public VagaController(VagaService service, VagaRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping
    public List<Vaga> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vaga>buscarPorId(@PathVariable Long id){
       return repository.findById(id)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public Vaga criar(@RequestBody Vaga v){
        return service.salvar(v);
    }

}
