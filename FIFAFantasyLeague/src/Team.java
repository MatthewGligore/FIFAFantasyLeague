public class Team {
    int ID;
    String name;;
    int goals;
    double possision;
    int passes;
    double rating;

    public Team(int ID, String name, int goals, double possision, int passes, double rating) {
        this.ID = ID;
        this.name = name;
        this.goals = goals;
        this.possision = possision;
        this.passes = passes;
        this.rating = rating;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public double getPossision() {
        return possision;
    }

    public int getPasses() {
        return passes;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPossision(double possision) {
        this.possision = possision;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " : " + goals + " : " + possision + " : " + passes + " : " + rating;
    }
}
