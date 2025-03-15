public class Player {
    private int id;
    private String name;
    private int age;
    private String positions;
    private String team;
    private String OVR;

    public Player(int id, String name, int age, String positions, String team) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.positions = positions;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPositions() {
        return positions;
    }

    public String getTeam() {
        return team;
    }

    public String getOVR() {
        return OVR;
    }

    public void setOVR(String OVR) {
        this.OVR = OVR;
    }

    @Override
    public String toString() {
        return name + " (" + team + ")";
    }
}
