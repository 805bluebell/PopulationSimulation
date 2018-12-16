//Pseudo code only


import java.util.*;

public class Jupiterite
{
    public static ArrayList<ArrayList<Integer>> generations = new ArrayList<ArrayList<Integer>>(); //List of a generations


    //Mate & die
    public static void wave()
    {
        ArrayList<Integer> zeroGen = generations.get(0);
        ArrayList<Integer> firstGen = generations.get(1);
        ArrayList<Integer> secondGen = generations.get(2);
        Random rand = new Random();
        int noOfFamiles = firstGen.size();
        int localNoOfFamiles = noOfFamiles;

            while(firstGen.size() >= 4) //Ensures that almost all familes of generation participate in mating season
            {
                int selection = rand.nextInt(firstGen.size());

                //System.out.println("Inside Loop 1");
                //This will not allow 0 family size to enter competition
                while(firstGen.get(selection) == 0 && firstGen.size() >= 2)
                {
                    //System.out.println("Inside Loop 2");
                    firstGen.remove(selection);
                    selection = rand.nextInt(firstGen.size());
                    System.out.println(generations);
                }


                int selection2 = rand.nextInt(firstGen.size());

                boolean flag = false;

                    //Trap for invalid matches
                    while(firstGen.get(selection2) == 0 || selection2 == selection || selection2 == selection+1 || selection2 == selection-1)
                    {
                        //System.out.println("Inside Loop 3");
                        if(firstGen.get(selection2) == 0)
                        {
                            firstGen.remove(selection2);
                        }
                        selection2 = rand.nextInt(firstGen.size());
                    }

                        //Adding children to the couple in next generation
                        secondGen.add(rand.nextInt(10));

                        int foo = firstGen.get(selection) - 1;
                        int boo = firstGen.get(selection2) - 1;
                        firstGen.set(selection,foo);
                        firstGen.set(selection2,boo);


                        flag = true;

                //Removing all zero elements
                for(int i = 0; i < firstGen.size(); i++)
                {
                    if(firstGen.get(i) == 0)
                    {
                        firstGen.remove(i);
                    }
                }


            }

        System.out.println("Outside all Loops");
        System.out.println(generations);

        zeroGen = firstGen;
        firstGen = secondGen;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        secondGen = temp;
        System.out.println(generations.get(1));
    }

    public static void initialStuff()
    {
        Random rand = new Random();

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp.add(rand.nextInt(4));
        }
        generations.add(temp);


        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp2.add(rand.nextInt(4));
        }
        generations.add(temp2);


        ArrayList<Integer> temp3 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp3.add(rand.nextInt(4));
        }
        generations.add(temp3);

        System.out.println(generations);

    }

    public static void initialStuff2()
    {
        Random rand = new Random();

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp.add(0);
        }
        generations.add(temp);


        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp2.add(0);
        }
        generations.add(temp2);


        ArrayList<Integer> temp3 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            temp3.add(0);
        }
        generations.add(temp3);

        System.out.println(generations);

    }


    public static void main(String[] args)
    {
        initialStuff();
        wave(); //Run thousand times
        wave();
        System.out.println("Gen 1 size" + generations.get(0).size());
        System.out.println("Gen 2 size" + generations.get(1).size());
        System.out.println("Gen 3 size" + generations.get(2).size());
    }
}
