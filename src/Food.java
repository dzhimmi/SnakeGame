public class Food
{
    private int healValue;
    private String foodName;

    Food(String name,int heal)
    {
        this.foodName = name;
        this.healValue = heal;
    }

    int getHealValue()
    {
        return healValue;
    }

    String getFoodName()
    {
        return foodName;
    }
}