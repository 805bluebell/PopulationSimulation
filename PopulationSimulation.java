import Helper.Martian; //The actual code is in this package
import java.util.*; // For generating random numbers for random age

public class PopulationSimulation
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        //declaring ArrayList with initial size n
        ArrayList<ArrayList> arrli = new ArrayList<ArrayList>(5);

        for (int j = 0; j < 5; j++)
        {
            ArrayList<Martian> arrlili = new ArrayList<Martian>(5);
            for (int i = 0; i < 5; i++)
            {
                arrlili.add(new Martian(rand.nextInt(80)));
            }
            arrli.add(arrlili);
        }

        System.out.println(arrli);



    }
}