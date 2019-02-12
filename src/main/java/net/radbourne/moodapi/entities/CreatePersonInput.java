package net.radbourne.moodapi.entities;

import net.radbourne.moodapi.enums.Mood;

public class CreatePersonInput {
    private String name;
    private int age;
    private Mood currentmood;

    public CreatePersonInput() {
    }

    public CreatePersonInput(String name, int age, Mood currentmood) {
        this.name = name;
        this.age = age;
        this.currentmood = currentmood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Mood getCurrentmood() {
        return currentmood;
    }
}
