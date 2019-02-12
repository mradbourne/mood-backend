package net.radbourne.moodapi.entities;

import net.radbourne.moodapi.enums.Mood;
import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Mood currentmood;

    public Person() {
    }

    public Person(String name, int age, Mood currentmood) {
        this.name = name;
        this.age = age;
        this.currentmood = currentmood;
    }
}
