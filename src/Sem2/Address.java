package Sem2;

/**
 * The purpose of Address is to...
 *
 * @author kasper
 */
public class Address
{

    String street;

    @Override
    public String toString()
    {
        return "Address{" + "street=" + street + '}';
    }

    public String getStreet()
    {
        return street;
    }

    Address(String st)
    {
        street = st;
    }
}
