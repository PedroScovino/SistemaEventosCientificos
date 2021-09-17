package devproject.eventosapirest.controller;

import devproject.eventosapirest.model.Autor;
import devproject.eventosapirest.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping(path = "/autor/{idAutor}")
    public ResponseEntity recuperar(@PathVariable("idAutor") Integer idAutor){
        return autorRepository.findById(idAutor)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/autor/listar")
    public Iterable<Autor> listar(){
        return autorRepository.findAll();
    }

    @PostMapping(path = "/autor/criar")
    public Autor criar (@RequestBody Autor autor){
        return autorRepository.save(autor);
    }

    @DeleteMapping(path = "/autor/remover/{idAutor}")
    public void remover (@PathVariable("idAutor") Integer idAutor){
        autorRepository.deleteById(idAutor);
    }

    @PutMapping(path = "/autor/atualizar")
    public Autor atualizar (@RequestBody Autor autor){
        return autorRepository.save(autor);
    }
}
