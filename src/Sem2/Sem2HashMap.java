package Sem2;

import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of Sem2HashMap is to...
 *
 * @author kasper
 */
public class Sem2HashMap
{

    private KeyValuePair[] internal;
    private int slotsUsed;

    public Sem2HashMap()
    {
        internal = new KeyValuePair[12];
    }

    public Address get(String key)
    {
        Address test = null;
        if (!(key == null || key.isEmpty()))
        {
            int index = calcIndex(key, internal);
            if (index >= 0)
            {
                if (internal[index] == null)
                {
                    System.out.println("nullpointer lige om lidt");
                } else if (internal[index].key.equals(key))
                {
                    test = internal[index].value;
                }
            }
        }
        return test;
    }

    public void put(String key, Address value) throws Exception
    {
        int index = 0;
        KeyValuePair kp = new KeyValuePair(key, value);
        index = calcIndex(key, internal);
        if (internal.length / 4 * 3 < slotsUsed)
        {
            extend();
        }
        if (index < 0)
        {
            throw new Exception("ALT ER OPTAGET. PRØV VENLIGST SENERE");
        } else
        {
            internal[index] = kp;
            slotsUsed++;
        }
    }

    public void extend()
    {
        //nyt array dobbelt størrelse af gamle array
        KeyValuePair[] newArray = new KeyValuePair[internal.length * 2];
        int index = 0;
        //loop alt fra det gamle array og indsæt i det nye array ud fra calcIndex med det nye array
        for (int i = 0; i < internal.length; i++)
        {
            if (internal[i] != null)
            {
                //flyt KeyValuePair over
                KeyValuePair kp = internal[i];
                index = calcIndex(kp.key, newArray);
                newArray[index] = kp;
            }
            if (index < 0)
            {
                System.out.println("det går galt");
            }
        }
        internal = newArray;
        //sæt det gamle array = det nye/temporare
    }

    public int calcIndex(String key, KeyValuePair[] currentArray)
    {
        int result = -1;
        int counter = 0;
        int n = currentArray.length;
        boolean indexFound = false;
        int index = Math.abs(key.hashCode() % currentArray.length);

        if (currentArray[index] == null || currentArray[index].key.equals(key))
        {
            result = index;
        } else
        {
            while (counter < n && !indexFound)
            {
                index = (index + 1) % n;
                if (currentArray[index] == null || currentArray[index].key.equals(key))
                {
                    result = index;
                    indexFound = true;
                }
                counter++;
            }
        }
        return result;
    }

    public boolean containsKey(String key)
    {
        int index = key.hashCode() % internal.length;
        return internal[index] != null;
    }

    public int size()
    {
        int s = 0;
        for (int i = 0; i < internal.length; i++)
        {
            if (internal[i] != null)
            {
                s++;
            }
        }
        return s;
    }

    public List<Address> values()
    {
        ArrayList<Address> all = new ArrayList();
        for (int i = 0; i < internal.length; i++)
        {
            if (internal[i] != null)
            {
                all.add(internal[i].value);
            }
        }
        return all;
    }

    @Override
    public String toString()
    {
        return "Sem2HashMap{" + "internal=" + internal + '}';
    }

}
