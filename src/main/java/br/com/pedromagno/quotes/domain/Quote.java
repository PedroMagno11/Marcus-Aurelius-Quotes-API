package br.com.pedromagno.quotes.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String quote;
    @Column
    private String author;

    public Quote(String quote, String author){
        this.quote = quote;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Quote)){
            return false;
        }

        Quote quote1 = (Quote) obj;
        return Objects.equals(this.id, quote1.id) && Objects.equals(this.quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.quote);
    }

    @Override
    public String toString() {
        return "Quote{" + "id: " + this.id + ", quote: '" + this.quote + '\''+'}';
    }
}
