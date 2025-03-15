public class App {
    

    public static void main(String[] args) throws Exception {
        FifaCupStats stats = new FifaCupStats();
        stats.start();
        stats.loadPlayers();
        for (Player player : stats.players) {
            System.out.println(player);
        }
        stats.close();
    }
    
}
