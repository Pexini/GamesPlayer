package study;

public class Player {

    protected int id;
    protected String name;
    protected int stringht;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStringht() {
        return stringht;
    }

    public void setStringht(int stringht) {
        this.stringht = stringht;
    }


    public Player(int id, String name, int stringht) {
        this.id = id;
        this.name = name;
        this.stringht = stringht;
    }
}