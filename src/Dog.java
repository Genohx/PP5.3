public class Dog implements Comparable<Dog>
{
    private String dog;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount = 0;

    public Dog()
    {
        dog=null;
        age=0;
        breed=null;
        weight=0.0;
        dogCount++;
    }

    public Dog(String dog, int age, String breed, double weight)
    {
        this.dog=dog;
        this.age=age;
        this.breed=breed;
        this.weight=weight;
        dogCount++;
    }//end constructor

    public String getDog()
    {
        return dog;
    }

    public int getAge()
    {
        return age;
    }

    public String getBreed()
    {
        return breed;
    }

    public double getWeight()
    {
        return weight;
    }

    public static int getDogCount()
    {
        return dogCount;
    }
    //end getters

    public void setDog(String newDog)
    {
        dog = newDog;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }

    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }
    //end setters

    public int compareTo(Dog someDog)
    {
        if(this.age < someDog.age)
        {
            return -1;
        }
        else if(this.age == someDog.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public String toKilos()
    {
        double kilos = weight / 2.2046;
        return kilos +" kilograms";
    }
    //end toKilos

    public String toString()
    {
        String output = "";
        output+="Name: "+dog;
        output+="\nAge: "+age+" years old";
        output+="\nBreed: "+breed;
        output+="\nWeight(in lbs): "+weight;
        return output;
    }//end toString
}//end class Dog
