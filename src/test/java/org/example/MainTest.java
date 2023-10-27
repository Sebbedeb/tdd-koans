package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest
{
    Main main = new Main();
    /*
    Write a method greet(name) that interpolates name in a simple greeting. For example, when name is "Bob", the method should return a string "Hello, Bob.".

    Handle nulls by introducing a stand-in. For example, when name is null, then the method should return the string "Hello, my friend."

    Handle shouting. When name is all uppercase, then the method should shout back to the user. For example, when name is "JERRY" then the method should return the string "HELLO JERRY!"

    Handle two names of input. When name is an array of two names (or, in languages that support it, varargs or a splat), then both names should be printed. For example, when name is ["Jill", "Jane"], then the method should return the string "Hello, Jill and Jane."

    Handle an arbitrary number of names as input. When name represents more than two names, separate them with commas and close with an Oxford comma and "and". For example, when name is ["Amy", "Brian", "Charlotte"], then the method should return the string "Hello, Amy, Brian, and Charlotte."

    Allow mixing of normal and shouted names by separating the response into two greetings. For example, when name is ["Amy", "BRIAN", "Charlotte"], then the method should return the string "Hello, Amy and Charlotte. AND HELLO BRIAN!"

    If any entries in name are a string containing a comma, split it as its own input. For example, when name is ["Bob", "Charlie, Dianne"], then the method should return the string "Hello, Bob, Charlie, and Dianne.".

    Allow the input to escape intentional commas introduced by Requirement 7. These can be escaped in the same manner that CSV is, with double quotes surrounding the entry. For example, when name is ["Bob", "\"Charlie, Dianne\""], then the method should return the string "Hello, Bob and Charlie, Dianne.".
     */

    @Test
    void greetOneName()
    {
        String greeting = main.greet("Bob");
        String expected = "Hello, Bob.";
        assertEquals(expected, greeting);
    }

    @Test
    void greetNull()
    {
        String greeting = main.greet((String) null);
        String expected = "Hello, my friend.";
        assertEquals(expected, greeting);
    }

    @Test
    void greetShout()
    {
        String greeting = main.greet("JERRY");
        String expected = "HELLO JERRY!";
        assertEquals(expected, greeting);
    }

    @Test
    void greetTwoNames()
    {
        String greeting = main.greet(new String[]{"Jill", "Jane"});
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected, greeting);
    }
    @Test
    void greetManyNames()
    {
        String greeting = main.greet(new String[]{"Amy", "Brian", "Charlotte"});
        String expected = "Hello, Amy, Brian, and Charlotte.";
        assertEquals(expected, greeting);
    }
    @Test
    void greetShoutAndNormal()
    {
        String greeting = main.greet(new String[]{"Amy", "BRIAN", "Charlotte"});
        String expected = "Hello, Amy, and Charlotte. AND HELLO BRIAN!";
        assertEquals(expected, greeting);
    }
    @Test
    void greetComma()
    {
        String greeting = main.greet(new String[]{"Bob", "Charlie, Dianne"});
        String expected = "Hello, Bob, Charlie, and Dianne.";
        assertEquals(expected, greeting);
    }
    @Test
    void greetCommaEscaped()
    {
        String greeting = main.greet(new String[]{"Bob", "\"Charlie, Dianne\""});
        String expected = "Hello, Bob and Charlie, Dianne.";
        assertEquals(expected, greeting);
    }

}