package package1;

public interface Composant {


    String getName ();
    String getContent();
    String getOwner();
    double getSize();
    void appendContent(String content);
    void setOwner(String owner);


}