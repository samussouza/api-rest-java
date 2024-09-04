package com.java.api_rest.controller;

import com.java.api_rest.entity.Pessoa;
import com.java.api_rest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(value = "/pessoa", method = RequestMethod.GET)
    public List<Pessoa> Get(){
        return pessoaRepository.findAll();
    }
    @RequestMapping(value = "/pessoa/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pessoa> GetById(@PathVariable(value = "id") long id){
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @RequestMapping(value = "/pessoa", method = RequestMethod.POST)
    public Pessoa Post(@Validated @RequestBody Pessoa pessoa){
            return pessoaRepository.save(pessoa);
    }

}
