package br.com.pedromagno.quotes.core.database;

import br.com.pedromagno.quotes.domain.Quote;
import br.com.pedromagno.quotes.services.QuoteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseLoader {
    @Bean
    CommandLineRunner init(QuoteService service){
        return args->{
            service.createQuote(new Quote("You have power over your mind—not outside events. Realize this, and you will find strength." ," Marcus Aurelius"));
            service.createQuote(new Quote("The happiness of your life depends upon the quality of your thoughts.", "Marcus Aurelius"));
            service.createQuote(new Quote("The soul becomes dyed with the color of its thoughts.", "Marcus Aurelius"));
            service.createQuote(new Quote("What we do now echoes in eternity.", "Marcus Aurelius"));
            service.createQuote(new Quote("Death smiles at us all; all a man can do is smile back.", "Marcus Aurelius"));
            service.createQuote(new Quote("The impediment to action advances action. What stands in the way becomes the way.", "Marcus Aurelius"));
            service.createQuote(new Quote("Accept the things to which fate binds you, and love the people with whom fate brings you together, but do so with all your heart.", "Marcus Aurelius"));
            service.createQuote(new Quote("He who lives in harmony with himself lives in harmony with the universe.", "Marcus Aurelius"));
            service.createQuote(new Quote("Never let the future disturb you. You will meet it, if you have to, with the same weapons of reason which today arm you against the present.", "Marcus Aurelius"));
            service.createQuote(new Quote("The universe is change; our life is what our thoughts make it.", "Marcus Aurelius"));
            service.createQuote(new Quote("If someone can show me that I am wrong or mistaken in any thought or action, I shall gladly change. I seek the truth, which never harmed anyone. The harm is to persist in one's own self-deception and ignorance.", "Marcus Aurelius"));
            service.createQuote(new Quote("Life is neither good nor evil, but only a place for good and evil.", "Marcus Aurelius"));
            service.createQuote(new Quote("Never act without purpose or resolve.", "Marcus Aurelius"));
            service.createQuote(new Quote("The true worth of a man is to be measured by the objects he pursues.", "Marcus Aurelius"));
            service.createQuote(new Quote("Time is like a river made up of the events which happen, and a violent stream; for as soon as a thing has been seen, it is carried away, and another comes in its place, and this will be carried away too.","Marcus Aurelius"));

        };
    }
}
