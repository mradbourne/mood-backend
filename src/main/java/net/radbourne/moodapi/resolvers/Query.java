package net.radbourne.moodapi.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import net.radbourne.moodapi.entities.Person;
import net.radbourne.moodapi.enums.Mood;
import net.radbourne.moodapi.repositories.PersonRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final PersonRepository PersonRepository;

    public Iterable<Person> people(Mood mood) {
        if (mood == null) {
            return PersonRepository.findAll();
        }
        return PersonRepository.findByCurrentmood(mood);
    }
}
