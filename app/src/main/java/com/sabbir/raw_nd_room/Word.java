package com.sabbir.raw_nd_room;


// the data class
public class Word {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    private String word;
    private String definition;

    public Word(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }
}
