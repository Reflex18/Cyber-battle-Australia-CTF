package defpackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: REGULAR_SCRIPTING-unknown.class */
public class challenge {
    public static String toHex(String i) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5sum = md.digest(i.getBytes());
        String output = String.format("%032X", new BigInteger(1, md5sum));
        return output;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Pattern p = Pattern.compile("ctftech\\{b\\d\\d\\d-e\\dba-\\dd\\d\\d-11ec}");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        if (b && toHex(input).equalsIgnoreCase("ad2e1c419eb66c002c3bdd7bad415203")) {
            System.out.println(input);
        } else {
            System.out.println("Wrong");
        }
    }
}