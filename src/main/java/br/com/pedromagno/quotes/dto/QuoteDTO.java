package br.com.pedromagno.quotes.dto;

import br.com.pedromagno.quotes.domain.Quote;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record QuoteDTO(String quote, String author) {
    public QuoteDTO(Quote quote){
        this(quote.getQuote(), quote.getAuthor());
    }
}
