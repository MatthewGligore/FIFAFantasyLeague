public class Players {
    int ID;
    int OVR;
    String name;
    int Age;
    String position;
    String team;

    public Players(int ID, int OVR, String name, int Age, String position, String team) {
        this.ID = ID;
        this.OVR = OVR;
        this.name = name;
        this.Age = Age;
        this.position = position;
        this.team = team;
    }

    // Getter
    public int getID() {
        return ID;
    }

    public int getOVR() {
        return OVR;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    // Setter
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setOVR(int OVR) {
        this.OVR = OVR;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return name + " : " + OVR + " : " + Age + " : " + position + " : " + team;
    }
}
