
public class Loader
{
    public static void main(String[] args)
    {
        Cat kitten = getKitten(1100);
        kitten.setColorCat(String.valueOf(CatColor.BLACK));
        System.out.println("Generated new kitten but using private method 'getKitten' and weight output:" + kitten.getWeight());
        System.out.println("Kitten color is:" + kitten.getColorCat());
        System.out.println("Kitten is a live:"+kitten.isCatALive());
        Cat catCloneKitten = getKitten(0);
        catCloneKitten.dublicateCat(kitten.getWeight(),kitten.getColorCat());
        System.out.println("This is clone First cat, his weight is '" + catCloneKitten.getWeight() + "' and cat color is '" +catCloneKitten.getColorCat() + "'");

        System.out.println("----------------------------------------");

        Cat catFirst = new Cat(5000);

        System.out.println("First cat weight:" + catFirst.getWeight());

        //Clone firs cat
        Cat catDublicateFirstCat = new Cat();
        catDublicateFirstCat.dublicateCat(catFirst.getWeight(),catFirst.getColorCat());
        System.out.println("This is clone First cat, his weight is '" + catDublicateFirstCat.getWeight() + "' and cat color is '" +catDublicateFirstCat.getColorCat() + "'");
        System.out.println("Total live cats counted: " + Cat.getCoutCats());

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

        while (!catFirst.getStatus().equals("Dead")){
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
        System.out.println("First cat is a live:"+catFirst.isCatALive());
        System.out.println("Total live cats counted: " + Cat.getCoutCats());
        System.out.println("=================================================");

        var catSecond = new Cat();

        System.out.println("Second cat weight:" + catSecond.getWeight());
        System.out.println("Total live cats counted: " + Cat.getCoutCats());

        catFirst.feed(feed);
        System.out.println("Second cat weight:" + catSecond.getWeight());

        i = 0;
        m = 1;
        feed = 100;

        while (!catSecond.getStatus().equals("Exploded")){
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
        System.out.println("Total live cats counted:" + Cat.getCoutCats());

    }

    private static Cat getKitten(double weight){
        return new Cat(weight);
    }
}