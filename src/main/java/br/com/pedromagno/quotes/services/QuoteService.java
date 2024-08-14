package br.com.pedromagno.quotes.services;

import br.com.pedromagno.quotes.domain.Quote;
import br.com.pedromagno.quotes.dto.QuoteDTO;
import br.com.pedromagno.quotes.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository repository;
    @Transactional
    public void createQuote(Quote quote){
        repository.save(quote);
    }
    public Page<Quote> getAllQuotes(Pageable pagination) {
        return repository.findAll(pagination);
    }

    public Quote getOneQuote(Long id) {
        return repository.getReferenceById(id);
    }

    public Quote getRandomQuote() {
        return getOneQuote(nextLong(1,repository.count()));
    }

    private long nextLong(long lowerRange, long upperRange){
        return new Random().nextLong(lowerRange, upperRange);
    }

}
