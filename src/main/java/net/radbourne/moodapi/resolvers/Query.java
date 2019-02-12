package net.radbourne.moodapi.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import net.radbourne.moodapi.entities.Person;
import net.radbourne.moodapi.enums.Mood;
import net.radbourne.moodapi.repositories.PersonRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private final PersonRepository PersonRepository;

    public Query(net.radbourne.moodapi.repositories.PersonRepository personRepository) {
        PersonRepository = personRepository;
    }

    public Iterable<Person> people(Mood mood, boolean negate) {
        if (mood == null) {
            return PersonRepository.findAll();
        }

        if (negate) {
            return PersonRepository.findByCurrentmoodNot(mood);
        }

        return PersonRepository.findByCurrentmood(mood);
    }
}
