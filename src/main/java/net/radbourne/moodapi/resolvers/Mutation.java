package net.radbourne.moodapi.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import net.radbourne.moodapi.entities.CreatePersonInput;
import net.radbourne.moodapi.entities.Person;
import net.radbourne.moodapi.repositories.PersonRepository;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    private final PersonRepository PersonRepository;

    public Mutation(net.radbourne.moodapi.repositories.PersonRepository personRepository) {
        PersonRepository = personRepository;
    }

    public Person createPerson(CreatePersonInput input) {
        Person newPerson = new Person(input.getName(), input.getAge(), input.getCurrentmood());
        return PersonRepository.save(newPerson);
    }
}
