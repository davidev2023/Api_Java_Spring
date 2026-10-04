package api.system.tech.vagas.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vagas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeDaEmpresa;
    private double valorDoTrabalho;
    private String endereco;
    private String dataInicioEfim;
    private String descricaoVaga;


    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario nomeDivulgador;
}
