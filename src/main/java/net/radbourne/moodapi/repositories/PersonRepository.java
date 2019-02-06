package net.radbourne.moodapi.repositories;

import net.radbourne.moodapi.entities.Person;
import net.radbourne.moodapi.enums.Mood;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Iterable<Person> findByCurrentmood(Mood mood);
}
