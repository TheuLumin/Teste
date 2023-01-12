package Controller;

import Model.Pessoa;
import Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping // Método responsável pir listar o total de Pessoas //
    List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }
    @PostMapping // Método responsável pela criação de Pessoas //
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa criar (@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/{id}") // Método com função unica de editar cada pessoa // //
    public Pessoa editar (@PathVariable long id, @RequestBody Pessoa pessoa) {
        var pesquisaPessoa = pessoaRepository.findById(id);
        if (pesquisaPessoa == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        pessoa.setId(id);
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/{id}") // Consultar por id Pessoa específica //
    public Pessoa consultar (@PathVariable long id) {
        var pesquisaPessoa = pessoaRepository.findById(id);
        if (pesquisaPessoa == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return pessoaRepository.findById(id);
    }

    @GetMapping("/endereco/{id}") // Consultar de endereços de Pessoa //
    public Pessoa listarEndereco(@PathVariable long id) {
        var pesquisaPessoa = pessoaRepository.findById(id);
        if (pesquisaPessoa == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return null;
    }

}
