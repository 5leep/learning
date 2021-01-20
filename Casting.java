public class Casting {
    public static void main(String[] args) {
        // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        // Explicit Casting
        double z = 1.1;
        int v = (int)x + 2;
        System.out.println(v);

        
        String q = "1";
        //Integer.parseInt() = int
        //Short.parseShort, Float.parseFloat, etc.
        int w = Integer.parseInt(q) + 2;
        System.out.println(w);

        // what if string is a float...
        String e = "1.1";
        float r = Float.parseFloat(e) + 2;
        System.out.println(r);

        // what if string is a double...
        String t = "1.1";
        double p = Double.parseDouble(t) + 2;
        System.out.println(p);
    }
}
