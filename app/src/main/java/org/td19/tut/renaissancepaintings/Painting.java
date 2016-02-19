package org.td19.tut.renaissancepaintings;

/**
 * Created by the on 2/19/16.
 */
public class Painting
{

    private String description;
    private int id;
    public Painting(String s, int i) {
        this.description = s;
        this.id = i;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
