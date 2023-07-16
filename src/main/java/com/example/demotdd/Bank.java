package com.example.demotdd;

import java.util.Hashtable;

public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to))
            return 1;
        return rates.get(new Pair(from, to));
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

}
