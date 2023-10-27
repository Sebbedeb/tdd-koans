package org.example;

import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }

    public String greet(Object name)
    {
        String greeting = null;
        if(name == null)
        {
            greeting = "Hello, my friend.";
        }

        if(name instanceof String)
        {
            if (name.equals(((String) name).toUpperCase()))
            {
                greetingShout((String) name);
            }
            else
            {
                standardGreeting((String) name);
            }
        }
        if(name instanceof String[])
        {
            if(((String[]) name).length == 2)
            {
                twoNameGreeting((String[]) name);
            }
            else if(((String[]) name).length > 2)
            {
                manyNamesGreeting((String[]) name);
            }
        }
        return greeting;
    }

    public String greetingShout(String name)
    {
        return "HELLO " + name.toUpperCase() + "!";
    }

    public String standardGreeting(String name)
    {
        return "Hello, " + name + ".";
    }

    public String twoNameGreeting(String[] names)
    {
        return "Hello, " + names[0] + " and " + names[1] + ".";
    }

    public String manyNamesGreeting(String[] names)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder upperCaseString = new StringBuilder();
        sb.append("Hello, ");
        for(int i = 0 ; i < names.length-1 ; i++)
        {
            String nameOfIndex = names[i];
            if(!nameOfIndex.equals(nameOfIndex.toUpperCase()))
            {
                sb.append(nameOfIndex).append(", ");
            }
            else
            {
                upperCaseString.append(" AND HELLO ").append(nameOfIndex).append("!");
            }
        }
        sb.append("and ").append((names[names.length - 1])).append(".");
        sb.append(upperCaseString);
        return sb.toString();
    }
}