package br.com.pedromagno.quotes.controllers;

import br.com.pedromagno.quotes.domain.Quote;
import br.com.pedromagno.quotes.dto.QuoteDTO;
import br.com.pedromagno.quotes.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class QuoteController {
    private final static Quote NONE = new Quote("None", "eu");
    private final static Random RANDOMIZER = new Random();

    @Autowired
    private QuoteService service;

    @GetMapping
    public ResponseEntity<Page<QuoteDTO>> getAll(@PageableDefault(size = 25, sort = {"id"}) Pageable pagination){
        Page<QuoteDTO> quotes = service.getAllQuotes(pagination).map(QuoteDTO::new);
        return new ResponseEntity<>(quotes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuoteDTO> getOne(@PathVariable Long id){
        Quote quote = service.getOneQuote(id);
        QuoteDTO quoteDTO = new QuoteDTO(quote);
        return new ResponseEntity<>(quoteDTO, HttpStatus.OK);
    }

    @GetMapping("/random")
    public ResponseEntity<QuoteDTO> getRandomOne(){
        Quote quote = service.getRandomQuote();
        QuoteDTO quoteDTO = new QuoteDTO(quote);
        return new ResponseEntity<>(quoteDTO, HttpStatus.OK);
    }
}
