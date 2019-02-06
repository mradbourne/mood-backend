package net.radbourne.moodapi.entities;

import lombok.Data;
import net.radbourne.moodapi.enums.Mood;

import javax.persistence.*;

@Data
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Mood currentmood;

    private int age;
}
