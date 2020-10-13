package package1;

import java.util.ArrayList;

public class Feuille implements Composant {

    private String name;
    private String content;
    private String owner;
    private int size;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public void setOwner(String owner) {
        this.owner=owner;
    }

    @Override
    public void appendContent(String content) {
        this.content=content;
    }
}
