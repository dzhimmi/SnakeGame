public class Main
{
    public static void main(String[] args)
    {
        PC anon = new PC();
        anon.pcNaming("Jerry");
        Food apple = new Food("Apple",10);
        Food rotApple = new Food("Rotten Apple",-10);
        Food rawPork = new Food("Raw Pork",-50);
        Food cookedPork = new Food("Cooked Pork",50);

        anon.pcStatus();
        anon.eat(apple);
        anon.pcStatus();
        anon.eat(rawPork);
        anon.pcStatus();
    }
}