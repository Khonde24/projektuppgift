package se.moise.projektuppgift;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void extraMarkers(){
        System.out.println("---------------------------------------------->");
    }
}
