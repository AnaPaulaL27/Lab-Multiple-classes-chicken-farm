public class Farmer {

    private String name;
    private int collectedEggs;

    //constructor:

    public Farmer(String name) {
        this.name = name;
        this.collectedEggs = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCollectedEggs() {
        return this.collectedEggs;
    }

    public void collectEggs(Farm farm) {
        //loop through chickens on farm
        //get number of eggs available/ laid
        // add eggs to farmer's collected eggs
        // want to set all chickens eggs to 0 since they would have been collected

        // keep track of total eggs using counter:

        int totalEggs = 0;
        for (Chicken chicken : farm.getChickens()) {
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }

        this.collectedEggs = totalEggs;
    }
}