package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite implements Composant

    private Composant composant;

    private ArrayList<Composant> ListeComposant = new ArrayList<Composant>();

    public void addChild(Composant composant){
        ListeComposant.add(composant);
    }

    public void removeChild(Composant composant){
        ListeComposant.remove(composant);
    }

    public Iterator<Composant> getChildren(){
        return ListeComposant.iterator();
    }

    public void removeChildren(){
        ListeComposant.iterator().remove();
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public void appendContent(String content) {

    }

    @Override
    public void setOwner(String owner) {

    }
}