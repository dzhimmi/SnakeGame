public class PC
{
    private int health;
    private String name;

    PC()
    {
        health = 100;
    }

    void pcNaming(String name)
    {
        this.name = name;
    }

    void pcStatus()
    {
        System.out.println("Name: " + name + "\nHealth: " + health + "\n");
    }

    void eat(Food foodType)
    {
        health += foodType.getHealValue();
        System.out.println(name + " just ate " + foodType.getFoodName() + " and it affected health by: " + foodType.getHealValue() + "\n");
    }
}