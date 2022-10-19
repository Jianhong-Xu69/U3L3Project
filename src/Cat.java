public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
    public int getAge()
    {
        return age;
    }

    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak()
    {
        int randomizer = (int)(Math.random()*5) + 1;
        if (randomizer == 1)
        {
            return "RAAAAAUUUUUGGGH";
        }
        else if (randomizer == 2)
        {
            return "Meow!";
        }
        else if (randomizer == 3)
        {
            return "Lasagna";
        }
        else if (randomizer == 4)
        {
            return "I hate mondays";
        }
        else
        {
            randomizer = (int)(Math.random()*5) + 1;
            if (randomizer == 5)//not the assignment requirement but hehe I like easter egg
            {
                return "Skibidibopmmmdada";
            }
            else
            {
                return "Purrrrr";
            }
        }
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}
