public class Case34 {

    public static void main(String[] args) {

        String s1 = new String("You cannot change me");
        String s2 = new String("You cannot change me");

        String s3 = "You cannot change me";

        String s4 = "You cannot change me";

        String s5 = "You cannot " + "change me";

        String s6 = "You cannot ";

        String s7 = s6 + "change me";

        final String s8 = "You cannot ";

        String s9 = s8 + "change me";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s4 == s7);
        System.out.println(s4 == s9);
    }
}