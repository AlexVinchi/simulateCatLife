
public class Cat
{
    private double originWeight;

    private double sumEatenFood;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private String colorCat;

    static int totalCountCats;
    static final int minWeightCat = 1000;
    static final int maxWeightCat = 9000;

    static int getCoutCats(){

        return totalCountCats;
    }

    public Cat()
    {
        weight = Math.round(1500.0 + 3000.0 * Math.random());
        originWeight = Math.round(weight);
        minWeight = 1000.0;
        maxWeight = 9000.0;
        sumEatenFood = 0;
        totalCountCats++;

    }
    public Cat(double weight)
    {
        this();
        this.weight = weight;
    }

    public void setColorCat(String colorCat){
        this.colorCat = colorCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public String meow()
    {
        weight = weight - 1;
        if (getStatus().equals("Dead")) {
            totalCountCats--;
        }
        return "Meow";
        //System.out.println("Meow");
    }
    public void pee(Double lostWeight){
        weight = weight - lostWeight;
        System.out.println("The cat went to the toilet and lost weight " + lostWeight + " grams");
    }

    public void feed(Double amount)
    {
        sumEatenFood  = sumEatenFood + amount;
        weight = weight + amount;
        if (getStatus().equals("Exploded")) {
            totalCountCats--;
        }
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if (getStatus().equals("Exploded")) {
            totalCountCats--;
        }

    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getEatenFood(){ return sumEatenFood;}

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}