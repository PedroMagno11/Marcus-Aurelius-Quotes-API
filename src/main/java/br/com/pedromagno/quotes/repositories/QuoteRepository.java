package br.com.pedromagno.quotes.repositories;

import br.com.pedromagno.quotes.domain.Quote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Arrays;
import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> { }
