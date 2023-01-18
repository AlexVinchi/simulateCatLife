
public class Loader
{
    public static void main(String[] args)
    {
        Cat catFirst = new Cat();

        System.out.println("First cat weight:" + catFirst.getWeight());

        double feed = 10;
        catFirst.feed(feed);
        System.out.println("First cat weight:" + catFirst.getWeight());
        System.out.println("----------------------------------------");
        System.out.println("First cat ate " + catFirst.getEatenFood() + " grams of food");

        catFirst.feed(250.0);
        System.out.println("First cat weight:" + catFirst.getWeight());

        System.out.println("First cat ate " + catFirst.getEatenFood() + " grams of food.");
        catFirst.pee(100.0);
        System.out.println("The first cat weight after his went to the toilet is: " + catFirst.getWeight() + " grams.");
        System.out.println("----------------------------------------");

        int i = 0;
        int m = 1;

        while (catFirst.getStatus() != "Dead"){
            i++;
            if (i == 100){
                System.out.println(catFirst.meow() + " count meow:" + m * 100);
                m++;
                i = 0;
            }else catFirst.meow();
        }

        System.out.println("First cat weight:" + catFirst.getWeight());
        System.out.println("First cat ate " + catFirst.getEatenFood() + " grams of food");
        System.out.println("----------------------------------------");
        System.out.println("First cat status:" + catFirst.getStatus());
        System.out.println("=================================================");

        var catSecond = new Cat();

        System.out.println("Second cat weight:" + catSecond.getWeight());


        catFirst.feed(feed);
        System.out.println("Second cat weight:" + catSecond.getWeight());

        i = 0;
        m = 1;
        feed = 100;

        while (catSecond.getStatus() != "Exploded"){
            i++;
            if (i == 100){
                catSecond.feed(feed);
                System.out.println("count feed:" + m * 10);
                m++;
                i = 0;
            }else catSecond.feed(feed);
        }
        System.out.println("Second cat weight:" + catSecond.getWeight());
        System.out.println("Second cat status:" + catSecond.getStatus());



        /*
        var cat = new Cat();

        System.out.println(cat.getStatus());
        */
    }
}