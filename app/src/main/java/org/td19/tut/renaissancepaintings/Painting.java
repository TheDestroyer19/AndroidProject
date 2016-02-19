package org.td19.tut.renaissancepaintings;

/**
 * Contains the data for a single image on the app.
 * Created by TheDestroyer19 on 2/19/16.
 */
class Painting
{

    private final String description;
    private final int id;
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
