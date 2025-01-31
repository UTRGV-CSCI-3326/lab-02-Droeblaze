public class MixMatch
{
    public static void main(String[] args)
    {
        String words = "Setences ";
        char letter = 'A';
        short numShort = 100;
        int num = 1000;
        long numLong = 1000000L;
        float decimalF = 3.14f;
        double decimalD = 2.71828;
        boolean isBool = true;

        System.out.println(words + " <- String, a sequence of characters");
        System.out.println(letter + " <- char, a single character");
        System.out.println(numShort + " <- short, small whole number");
        System.out.println(num + " <- int, a whole number");
        System.out.println(numLong + " <- long, a big whole number");
        System.out.println(decimalF + " <- float, a number with a decimal point but less precise");
        System.out.println(decimalD + " <- double, similar to float but mroe precision");
        System.out.println(isBool + " <- boolean, true or false");

        System.out.println("Every data type together -> " + words + ", " + letter + ", " +  numShort + ", "  num + ", "  numLong + ", "  decimalF + ", "  decimalD + ", "  isBool);
    }
}