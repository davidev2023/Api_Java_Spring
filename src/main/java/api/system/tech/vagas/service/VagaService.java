package api.system.tech.vagas.service;


import api.system.tech.vagas.model.Vaga;
import api.system.tech.vagas.repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {
    private final VagaRepository repo;
    public VagaService(VagaRepository repo) {this.repo = repo; }

    public List<Vaga> listar() {return repo.findAll(); }
    public Vaga salvar(Vaga v) {return repo.save(v); }
    public Vaga buscarPorId(Long id) { return repo.findById(id).orElse(null); }


}
