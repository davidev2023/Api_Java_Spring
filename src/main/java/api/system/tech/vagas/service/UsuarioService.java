package api.system.tech.vagas.service;


import api.system.tech.vagas.model.Usuario;
import api.system.tech.vagas.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    public UsuarioService(UsuarioRepository repo){this.repo = repo; }

    public List<Usuario> listar() {return repo.findAll(); }
    public Usuario salvar(Usuario u) {return repo.save(u); }
    public Usuario buscarPorId(Long id) {return repo.findById(id).orElse(null); }
}
