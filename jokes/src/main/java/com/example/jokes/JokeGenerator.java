package com.example.jokes;

public class JokeGenerator {
    private static final String[] jokes = {
            "There's 500 bricks in a plane. How many are there if you throw one out? 499.",
            "There are three steps to putting an elephant in a refrigerator. What are they? Open the fridge, put the elephant in, close the fridge.",
            "There are four steps to putting a deer in the fridge. What are they? Open the fridge, take the elephant out, put the deer in, close the fridge.",
            "The Lion King is having a birthday party. All the animals are there but one. Why is that? The deer is in the fridge.",
            "A woman wants to cross an alligator infested swamp. How does she do it? She crosses normally because the alligators are at the Lion King's party.",
            "She dies anyways. Why? She gets hit in the head with a brick."
    };

    private int index = 0;

    public String getJoke() {
        return jokes[(index++) % jokes.length];
    }
}
