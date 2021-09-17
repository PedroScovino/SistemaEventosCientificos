package devproject.eventosapirest.controller;

import devproject.eventosapirest.model.Artigo;
import devproject.eventosapirest.repository.ArtigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArtigoController {

    @Autowired
    private ArtigoRepository artigoRepository;

    @GetMapping(path = "/artigo/{idArtigo}")
    public ResponseEntity recuperar(@PathVariable("idArtigo") Integer idArtigo){
        return artigoRepository.findById(idArtigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/artigo/listar")
    public Iterable<Artigo> listar(){
        return artigoRepository.findAll();
    }

    @PostMapping(path = "/artigo/criar")
    public Artigo criar (@RequestBody Artigo artigo){
        return artigoRepository.save(artigo);
    }

    @DeleteMapping(path = "/artigo/remover/{idArtigo}")
    public void remover (@PathVariable("idArtigo") Integer idArtigo){
        artigoRepository.deleteById(idArtigo);
    }

    @PutMapping(path = "/artigo/atualizar")
    public Artigo atualizar (@RequestBody Artigo artigo){
        return artigoRepository.save(artigo);
    }
}
