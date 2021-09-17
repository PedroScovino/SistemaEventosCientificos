package devproject.eventosapirest.controller;

import devproject.eventosapirest.model.Volume;
import devproject.eventosapirest.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VolumeController {

    @Autowired
    private VolumeRepository volumeRepository;

    @GetMapping(path = "/volume/{idVolume}")
    public ResponseEntity recuperar(@PathVariable("idVolume") Integer idVolume){
        return volumeRepository.findById(idVolume)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/volume/listar")
    public Iterable<Volume> listar(){
        return volumeRepository.findAll();
    }

    @PostMapping(path = "/volume/criar")
    public Volume criar (@RequestBody Volume volume){
        return volumeRepository.save(volume);
    }

    @DeleteMapping(path = "/volume/remover/{idVolume}")
    public void remover (@PathVariable("idVolume") Integer idVolume){
        volumeRepository.deleteById(idVolume);
    }

    @PutMapping(path = "/volume/atualizar")
    public Volume atualizar (@RequestBody Volume volume){
        return volumeRepository.save(volume);
    }
}
